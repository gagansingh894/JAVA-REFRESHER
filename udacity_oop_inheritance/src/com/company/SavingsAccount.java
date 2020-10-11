package com.company;

public class SavingsAccount extends BankAccount {

    double limit;

    void  setLimit(double l) {
        this.limit = l;
    }

    double getLimit() {
        return this.limit;
    }
}
