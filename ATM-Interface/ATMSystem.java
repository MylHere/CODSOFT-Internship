import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");

        int attempts = 0;
        int maxAttempts = 3;
        boolean cardBlocked = false;

        while (attempts < maxAttempts) {
            if (cardBlocked) {
                System.out.println("Your card is blocked. Please contact your bank.");
                break;
            }

            System.out.println("Enter your PIN:");
            int pin = sc.nextInt();

            UserBankAccount userAccount = new UserBankAccount(pin);
            ATM atm = new ATM(userAccount);

            if (userAccount.isvalidpin()) {
                System.out.println("Select what you want to do:");
                System.out.println("1. Withdraw money");
                System.out.println("2. Deposit money");
                System.out.println("3. Check Balance");
                int option = sc.nextInt();

                if (option == 1) {
                    System.out.println("Enter amount amount you want to withdraw:");
                    int withdrawAmount = sc.nextInt();
                    atm.withdraw(withdrawAmount);
                } else if (option == 2) {
                    System.out.println("Enter amount you want to deposit:");
                    int depositAmount = sc.nextInt();
                    atm.deposit(depositAmount);
                } else if (option == 3) {
                    atm.checkbakance();
                }
                System.out.println("Thank You for using this ATM.");
                break;
            } else {
                attempts++;
                System.out.println("Invalid PIN.");
                if (attempts >= maxAttempts) {
                    cardBlocked = true;
                    System.out.println("Your card is blocked. Please contact your bank.");
                }
            }
        }

    }
}

