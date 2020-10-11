package com.company;

public class Main {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount();
        SavingsAccount savingsAccount = new SavingsAccount();
        COD cod = new COD();

        checkingAccount.setAccount("CA123");
        checkingAccount.setBalance(100.00);
        checkingAccount.setLimit(100.00);
        System.out.println("Checking Account: " + checkingAccount.account);
        System.out.println("Checking Balance: " + checkingAccount.balance);
        System.out.println("Checking Limit: " + checkingAccount.limit);

        System.out.println("---------------------------");

        savingsAccount.setAccount("SA123");
        savingsAccount.setBalance(1000.00);
        savingsAccount.setLimit(10000.00);
        System.out.println("Savings Account: " + savingsAccount.account);
        System.out.println("Savings Balance: " + savingsAccount.balance);
        System.out.println("Savings Limit: " + savingsAccount.limit);

        System.out.println("---------------------------");

        cod.setAccount("COD123");
        cod.setBalance(500.00);
        cod.setLimit(1000.00);
        System.out.println("COD Account: " + cod.account);
        System.out.println("COD Balance: " + cod.balance);
        System.out.println("COD Limit: " + cod.limit);

        // Polymorphism
        Queen queen = new Queen();
        Position testPosition = new Position(3, 10);

        if (queen.isValidMove(testPosition)) {
            System.out.println("Yes, I can move there.");
        } else {
            System.out.println("Nope, can't do");
        }

        // Static Example
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();

        System.out.println("Local Count: " + person4.localCount);
        System.out.println("Instance Count: " + Person.instanceCount);
    }
}

