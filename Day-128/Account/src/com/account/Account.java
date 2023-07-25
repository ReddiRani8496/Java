package com.account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account {


    private int accID;
    private double balance;
    AccountType accountType;

    static Scanner scanner = new Scanner(System.in);

    public Account() {

        accID = getAccID();
        balance = isValidBalance();
        while(true) {
            System.out.println("Select the Account Type: ");
            System.out.println("1. Savings Account:");
            System.out.println("2. Current Account:");
            System.out.print("Enter your choice: ");
            int x = scanner.nextInt();
            if (x == 1) {
                accountType = AccountType.SAVINGS;
                break;
            } else if (x == 2) {
                accountType = AccountType.CURRENT;
                break;
            } else {
                System.out.println("Enter a valid choice");
            }
        }
    }


    private int getAccID() {
        return (int)(Math.random()*101);
    }


    private double isValidBalance() {
        double balance = 0;
        System.out.print("Enter the balance : ");

        while (true) {

            try {
                balance = scanner.nextDouble();

                if(balance >= 0)
                    break;
                System.out.println("The balance more than or equal to 0");

            } catch (InputMismatchException e) {

                System.out.println("Balance must be a number");

                scanner.next();

            }
        }

        return balance;
    }

    public Account(int accID, double balance, String accountType) {
        this.accID = accID;
        this.balance = balance;
        this.accountType = AccountType.valueOf(accountType);
    }

    public void deposit() {

        while(true) {
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            if(isValidDepositAmt(amount)) {
                this.balance += amount;
                System.out.println("Rs." + amount + " has been successfully deposited :)");
                return;
            }
            System.out.println("Deposit a positive amount: ");
        }
    }

    private boolean isValidDepositAmt(double amount) {
        return amount>0;
    }

    public void withdraw() {
        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();
        if(!isValidWithdrawAmount(amount)) {
            System.err.println("Enter a valid withdrawal amount!");
            return;
        }
        if(isvalidBalance()) {
            System.err.println("Amount is insufficient to withdraw!");
            return;
        }
        if(!(amount<=this.balance)) {
            System.err.println("Balance is less than withdrawal amount");
            return;
        }

        this.balance -= amount;
        System.out.println("your transaction is successful with a withdrawal request of Rs."+amount);
    }

    private boolean isValidWithdrawAmount(double amount) {
        return amount>0;
    }

    public double getBalance() {
        return balance;
    }

    private boolean isvalidBalance() {
        return this.getBalance()<=0;
    }


    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accID=" + accID +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
/*
Create a package “com.account”.
Create a class “Account” with the fields acctId, acctType, acctBalance. Use Constructor
to set the values to these fields. Create the following methods in the Account class
void deposit(int amount)
void withdraw(int amount)
int getBalance()
void display()
 */