package com.javamasterclass.debugging.banking;

public class BankAccount {
    private String firstName;
    private String lastName;
    private Double balance;

    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, Double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // The branch argument is true if the customer is performing the transaction at a branch w/ a teller
    // false - if deposit is made at an ATM
    public Double deposit(double amount, boolean branch){
        balance += amount;
        return balance;
    }

    public Double withdraw(double amount, boolean branch){
        if ((amount > 500.00) && !branch){
            throw new IllegalArgumentException();
        }
        balance -= amount;
        return balance;
    }

    public Double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }
    // More methods that use firstName, lastName, and perform other functions
}
