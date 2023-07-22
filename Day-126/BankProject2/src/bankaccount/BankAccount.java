package bankaccount;

import java.util.Scanner;

public class BankAccount {
    String accNo;
    TypeOfAccount typeOfAccount;
    int balance;

    Scanner scan = new Scanner(System.in);

    public BankAccount() {
        accNo = "";
        typeOfAccount = TypeOfAccount.SAVING;
        balance = 0;
    }


    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public TypeOfAccount getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(TypeOfAccount typeOfAccount) {
        this.typeOfAccount = typeOfAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void createAccount() {

        String accountNo = genAccountNumber();
        setAccNo(accountNo);

        while(true) {
            System.out.println("1. Savings Account:");
            System.out.println("2. Current Account:");
            int x = scan.nextInt();
            if (x == 1) {
                setTypeOfAccount(TypeOfAccount.SAVING);
                break;
            } else if (x == 2) {
                setTypeOfAccount(TypeOfAccount.CURRENT);
                break;
            } else {
                System.out.println("Enter a valid choice");
            }
        }

    }

    public void deposit() {

        while(true) {
            System.out.print("Enter the amount: ");
            double amount = scan.nextDouble();
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
        double amount = scan.nextDouble();
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
    private boolean isvalidBalance() {
        return this.getBalance()<=0;
    }

    public void display() {
        System.out.println(this);
    }

    String genAccountNumber() {
        String acc = "";
        for(int i=0;i<11;i++) {
            int x = (int)(Math.floor(Math.random()*10));
            acc += String.valueOf(x);
        }
        return acc;
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                ", accNo='" + accNo + '\'' +
                ", typeOfAccount=" + typeOfAccount +
                ", balance=" + balance +
                '}';
    }
}

