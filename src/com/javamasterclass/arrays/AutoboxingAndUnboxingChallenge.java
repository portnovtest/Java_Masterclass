package com.javamasterclass.arrays;

public class AutoboxingAndUnboxingChallenge {
    public static void main(String[] args) {
        Bank bank = new Bank("Wells Fargo");
        if (bank.addBranch("Fargo")) {
            System.out.println("Fargo branch created");
        }
        bank.addBranch("San Diego");
        bank.addCustomer("San Diego", "Phil", 50.05);
        bank.addCustomer("San Diego", "Vika", 175.34);
        bank.addCustomer("San Diego", "Roma", 220.12);

        bank.addBranch("San Francisco");
        bank.addCustomer("San Francisco", "Bob", 150.54);

        bank.addCustomerTransaction("San Diego", "Phil", 44.22);
        bank.addCustomerTransaction("San Diego", "Phil", 12.44);
        bank.addCustomerTransaction("San Diego", "Vika", 1.65);

        bank.listCustomers("San Diego", true);
        bank.listCustomers("San Francisco", true);

        bank.addBranch("Fargo");
        if (!bank.addCustomer("Fargo", "Brian", 5.53)) {
            System.out.println("Error Fargo branch does not exist");
        }

        if (!bank.addBranch("Fargo")) {
            System.out.println("Branch Fargo already exists");
        }

        if (!bank.addCustomerTransaction("Fargo", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("San Diego", "Phil", 12.21)) {
            System.out.println("Customer Phil already exists");
        }
    }


}
