import java.util.*;
public class Project3ATM {
    static String user;
    static int balance;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("JAVA ATM");
        System.out.println("Welcome, What would you like to do");
        System.out.println("Enter your account number(ABJ5000 - ABJ5004)");
        user=sc.next();
        balance=Project3User.balance(user);
        while (true) {
            System.out.println("Enter " + "\n" + "1- Withdrawal" + "\n" + "2- Deposit" + "\n" + "3- Check Balance" + "\n" + "4- Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to withdraw");
                    int WithAmnt = sc.nextInt();
                    Withdrawal(WithAmnt);
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit");
                    int DepAmnt = sc.nextInt();
                    Deposit(DepAmnt);
                    break;
                case 3:
                    int BalAmnt = CheckBalance();
                    System.out.println("Your Balance " + BalAmnt);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
    static void Withdrawal(int amnt){
        if(amnt<=balance){
            balance=balance-amnt;
            System.out.println("Your amount has been withdrawn successfully");
        }
        else if(amnt>balance){
            System.out.println("You dont have enough money to withdraw");
        }
        if(balance<500){
            System.out.println("ALERT!!! Your account balance is less than minimum balance(Rs.500/-) ");
        }
    }
    static void Deposit(int amnt){
        balance=balance+amnt;
        System.out.println("Deposited successfully");
    }
    static int CheckBalance(){
        return balance;
    }


}
