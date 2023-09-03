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
