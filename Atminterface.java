import java.util.Scanner;
public class Atminterface {
    public static void main(String args[])
     {
       int balance=10000,withdraw,deposit;
       Scanner sc=new Scanner(System.in);
       while(true)
       {
        System.out.println("**********WELCOME TO ATM INTERFACE**********");
        System.out.println("Choose 1 for withdraw");
        System.out.println("Choose 2 for deposit");
        System.out.println("Choose 3 to check balance");
        System.out.println("Choose 4 to exit");
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter the amount you want to withdraw:");
            withdraw=sc.nextInt();
            if(balance>=withdraw)
            {
                balance=balance-withdraw;
                System.out.println("Please collect your money");
            }
            else{
                System.out.println("Insufficient Balanace");
            }
            System.out.println();
            break;

            case 2:
            System.out.println("Enter the amount you want to deposit:");
            deposit=sc.nextInt();
            balance=balance+deposit;
            System.out.println("Money Succesfully Deposited");
            System.out.println();
            break;

            case 3:
            System.out.println("Remaining Balance:"+balance);
            System.out.println();
            break;
            
            case 4:
            System.exit(0);
         }
       }
    }
}
