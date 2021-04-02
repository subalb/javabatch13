package Lab1;

import java.util.Random;
import java.lang.Math;
public class BankAccount {

    private int accountNum;
    private String name;
    private double balance;

    public BankAccount(String accName, double initialBalance){
        accountNum = 10000 + new Random().nextInt(90000);
        name = accName;
        balance = initialBalance;


    }
    public BankAccount(String accName){
        name = accName;
        accountNum = 10000 + new Random().nextInt(90000);
        balance = 0;


    }

    public void withdraw(double amount, double fee){
        double newBalance = balance - fee - amount;
        balance = newBalance;
    }

    public void deposit(double interest, double amount){
        double newBalance = (balance + amount)* (1+interest);
        balance = newBalance;
    }

    public int getAccount(){
        return accountNum;
    }

    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }




    public static void main(String[] args) {
        BankAccount one = new BankAccount("Subal", 15000);
        BankAccount two = new BankAccount("Santosh", 30000);
        BankAccount three = new BankAccount("Jack");

        //print initial balances
        System.out.println("Account " + one.getAccount() + " named as " + one.getName()+ " has initial balance of " + one.getBalance());
        System.out.println("Account " + two.getAccount() + " named as " + two.getName()+" has initial balance of " + two.getBalance());
        System.out.println("Account " + three.getAccount() + " named as " + three.getName()+" has initial balance of " + three.getBalance());

        one.deposit(0.10, 100);
        two.deposit(0.15, 150);
        three.deposit(0.2, 1500);

        System.out.println("-----------After depositing------------------");



        System.out.printf("Account " + one.getAccount() + " named as " + one.getName()+ " has balance of "+ " %f", (one.getBalance()));
        System.out.println("");
        System.out.printf("Account " + two.getAccount() + " named as " + two.getName()+ " has balance of " + " %f", (two.getBalance()));
        System.out.println(" ");
        System.out.printf("Account " + three.getAccount() + " named as " + three.getName()+ " has balance of " + " %f", (three.getBalance()));
        System.out.println("");

        //withdraw fund
        one.withdraw(1500, 50);
        two.withdraw(10000, 100);
        three.withdraw(100, 10);

        System.out.println("----------After withdrawing------------------- ");

        System.out.println("Account " + one.getAccount() +" named as " + one.getName()+ " has  balance of " + one.getBalance());
        System.out.println("Account " + two.getAccount() +" named as " + two.getName()+ " has balance of " + two.getBalance());
        System.out.println("Account " + three.getAccount() +" named as " + three.getName()+ " has balance of " + three.getBalance());









    }



}