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
