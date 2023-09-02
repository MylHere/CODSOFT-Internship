import java.util.Scanner;

public class ATM {

   private UserBankAccount user;

   public ATM(UserBankAccount user){
       this.user=user;
   }


    public void withdraw(int withdrawal) {
        int maxAttempts = 4;
        int attempts = 0;

        while (attempts < maxAttempts) {
            if (withdrawal <= user.getCurrentbalnce()) {
                user.reduceamount(withdrawal);
                System.out.println(withdrawal + " has been withdrawn from your account.");
                System.out.println("Now, your current balance is " + user.getCurrentbalnce());
                break;  // Exit the loop on successful withdrawal
            } else {
                System.out.println("Your current balance is insufficient.");
                attempts++;
                if (attempts < maxAttempts) {
                    System.out.println("Enter amount again :");
                    Scanner sc=new Scanner(System.in);
                    withdrawal = sc.nextInt();
                } else {
                    System.out.println("Sorry! Your transaction cannot be completed.");
                }
            }
        }
    }

    public void deposit(int deposit){
       user.addamount(deposit);
       System.out.println("Now, your current balance is "+user.getCurrentbalnce());
   }
   public void checkbakance(){
       System.out.println("Your current balance is "+user.getCurrentbalnce());
   }
}
public class UserBankAccount {
    int[] UsersPins={1234,5678,9102,3456,7891,2345,6789,1011,1213,1415};
    int[] Balances={10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};

    private int pin;
    int currentbalnce=-1;
    public UserBankAccount(int pin){
    this.pin=pin;
for(int i=0;i<UsersPins.length;i++){
    if(pin==UsersPins[i]){
        currentbalnce=Balances[i];
        break;
    }
}
}
public boolean isvalidpin() {
        return currentbalnce!=-1;
}
    public void reduceamount(int amount) {
        currentbalnce -= amount;
    }public void addamount(int amount) {
        currentbalnce += amount;
    }
public int getCurrentbalnce(){
        return currentbalnce;
}
}
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


