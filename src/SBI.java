import java.util.UUID;

public class SBI implements BankInterface{

    //bank have,acnt,name,apss,balnce,roi
     private String name;
    private String accountNo;//here string bec uuid generete char and no
    private  int balance;
    private String password;
    private  double rtaeOfInterest;

    public SBI(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rtaeOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
        //universaly unique identifier
    }



    //now craete consturctor ,here create constructor
    // for u give values like balne,name pass ,
    // these things u can give ,nut u cnat give account no ,
    // it will genetreted by system by uuid

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

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRtaeOfInterest() {
        return rtaeOfInterest;
    }

    public void setRtaeOfInterest(double rtaeOfInterest) {
        this.rtaeOfInterest = rtaeOfInterest;
    }




    //after intilaizing getter and stter we need to comaplte this functions
    @Override
    public int getBalance() {

        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return " money reicved";
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(enteredPassword.equals(this.password)){
            if(balance < amount){
                 return "Insuffiecient balance";
            }
            else{
                balance = balance-amount;
                return "Money detectted succesfully";
            }

        }
        else {
            return "invalid password,enter correct password";
        }

    }

    @Override
    public double calcualteROI(int time) {
        return (balance*rtaeOfInterest*time)/100.0;
    }
}
