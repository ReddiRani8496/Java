import bankaccount.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: bankAccount.createAccount();
                        break;
                case 2: bankAccount.deposit();
                        break;
                case 3: bankAccount.withdraw();
                        break;
                case 4: bankAccount.display();
                        break;
                case 5: return;
                default:
                    System.out.println("Enter valid choice");
            }

        }
    }
}