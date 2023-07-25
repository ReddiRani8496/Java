package com.account.test;

import com.account.Account;

import java.util.Scanner;

public class AccountMain {

    public static void main(String[] args) {

        Account account = new Account();

        while(true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int x = scanner.nextInt();

            switch (x) {
                case 1 -> account.deposit();
                case 2 -> account.withdraw();
                case 3 -> account.display();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Enter a valid choice.");
            }

        }
    }
}
