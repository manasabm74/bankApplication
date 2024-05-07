
import  java.util.*;
public class Main  {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //here we take ip ,that we defined in consrcor ,we giving values tyoe cnstrcour
        System.out.println("Enter your name,password,and intial balance");

        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        //once we have the input we need to create the object of sbi account
        SBI manasaAcc = new SBI(name,balance,password);

        //then test all methods one by one
        // test getaccno
        System.out.println("Your account has been created with account number:" +manasaAcc.getAccountNo());

        //test getbalance
        System.out.println("your current balance is:" +manasaAcc.getBalance());

        //test depositmoney
        System.out.println(("money deposited:" +manasaAcc.depositMoney(500)));
        System.out.println("new balance:" +manasaAcc.getBalance());

        //test withdraw
        System.out.println("Eneter amount to be withdrawn:");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();

        System.out.println(manasaAcc.withdrawMoney(amount,enteredPassword));

        //test intrest
        System.out.println("Interset on current balance:" +manasaAcc.getBalance()+ " is " +manasaAcc.calcualteROI(4));

    }
}