
public interface BankInterface {

    int getBalance();
    String depositMoney( int amount);
    String withdrawMoney(int amount,String enteredPassword);
    double calcualteROI(int time);

}
