package com.BankAccount;
import java.util.Random;


public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;

    static int noOfBankAccounts = 0;
    static double totalMoney = 0;

    public BankAccount() {
        noOfBankAccounts++;
        this.accountNumber = createAccountNumber();
        System.out.println(this.accountNumber);
    }

    private String createAccountNumber() {
        Random rand = new Random();
        int rand_int = rand.nextInt(1000000000);

        String accountNumber = Integer.toString(rand_int);
//        System.out.println("Random Integers: "+rand_int);
        return accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;

    }

    public void deposit(String accountType, double amount) {
        if (accountType == "checking") {
            checkingBalance += amount;
        }
        else if (accountType == "savings") {
            savingsBalance += amount;
        }
        else {
            System.out.println("Invalid account type");
        }
    }

    public void withdraw(String accountType, double amount) {
        if (accountType == "checking") {
            if (amount < this.checkingBalance) {
                checkingBalance -= amount;
            }
        }
        else if (accountType == "savings") {
            if (amount < this.savingsBalance) {
                savingsBalance -= amount;
            }
        }
    }

    public void getAccountTotals() {
        System.out.println("Checking account: $"+ getCheckingBalance());
        System.out.println("Savings account: $"+ getSavingsBalance());
    }


}
