package com.BankAccount;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

//      account1.createAccountNumber();
        account1.getCheckingBalance();
        account1.deposit("checking", 200);
        account1.deposit("checking", 200);
        account1.deposit("savings", 200);
        account1.deposit("checking", 200);
        account1.deposit("checking", 200);
        account1.deposit("savings", 200);

        account2.deposit("checking", 200);
        System.out.println(account2.getCheckingBalance());
        System.out.println(account2.getSavingsBalance());

        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());

        account1.withdraw("checking", 200);
        account1.withdraw("savings", 200);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingsBalance());

        account1.getAccountTotals();


    }

}
