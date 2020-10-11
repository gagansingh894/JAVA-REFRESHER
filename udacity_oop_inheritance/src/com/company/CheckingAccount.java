package com.company;

public class CheckingAccount extends BankAccount {

    double limit;

    void  setLimit(double l) {
        this.limit = l;
    }

    double getLimit() {
        return this.limit;
    }

}
