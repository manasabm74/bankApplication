import java.util.UUID;

public class HDFC implements BankInterface{

     private String name;
     private   String accountNo;
     private  String password;
      private int balance;
     private double rateOfInterest;


    public HDFC(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }


    //after setter getter,construcotor work done we need to
    // implemt function in metods

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Amount deposited suucesfully";
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if (enteredPassword.equals(this.password)) {
            if (balance < amount) {
                return "Insufficient balance";
            } else {
                balance = balance - amount;
                return "amount debitted sucesfully";
            }

        } else {
            return "Incorrect password,Enter the correct pasword ";
        }
    }

    @Override
    public double calcualteROI(int time) {
        return (balance*rateOfInterest*time)/100.0;

    }
}
