import java.util.Scanner;
interface user{
    void withdraw(int Amount);
    void deposit(int Amount);
    void checkBalance();
}
class UserBankAccount implements user{
    static int Balance = 20000; //initial account balance of the user
    @Override
    public void withdraw( int Amount) {
        Balance= Balance-Amount;
        System.out.println(Balance);
    }
    @Override
    public void deposit(int Amount) {
        Balance = Balance+Amount;
        System.out.println(Balance);
    }
    @Override
    public void checkBalance() {
        System.out.println(Balance);
    }
}
public class ATM {
    public static void main(String[] args) {
        UserBankAccount user1 = new UserBankAccount();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        int choice = sc.nextInt();
         switch (choice) {
            case 1:
                System.out.println("Enter the amount you want to withdraw");
                int A1 = sc.nextInt();
                if (A1 <= UserBankAccount.Balance) {
                    System.out.println("Withdrawal successfully completed !!");
                    System.out.println("Updated Balance: ");
                    user1.withdraw(A1);
                } else {
                    System.out.println("no sufficient balance for withdrawal");
                }
                break;
            case 2:
                System.out.println("Enter the amount you want to Deposit");
                int A2 = sc.nextInt();
                System.out.println("Deposit successfully completed !!");
                System.out.println("Updated Balance: ");
                user1.deposit(A2);
                break;
            case 3:
                System.out.println("Balance successfully fetched");
                user1.checkBalance();
                break;
            case 4:
                System.out.println("Goodbye!");
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}
