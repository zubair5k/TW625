package com.zubair;

public class Account {
    private int acntNo;
    private String holder;
    private double balance;

    public Account() {}
    public Account(int acntNo, String holder, double balance) {
        this.acntNo = acntNo;
        this.holder = holder;
        this.balance = balance;
    }

    public void summary() {
        System.out.println("A/C No: " + acntNo + " Holder: " + holder + " Balance: " + balance);
    }
}
