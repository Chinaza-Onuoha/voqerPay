package com.chinaza;

public class Account {
    private String name;
    private String type;
    private double balance;
    private double limit;
    private double depositLimit;
    private double withdrawalLimit;



    public Account(String name,String type){
        this.name = name;
        this.type = type;
        this.balance = 0;
        this.withdrawalLimit = 2_000_000;
        this.depositLimit = 0;


    }

    public boolean setLimit(){
        boolean isValid = false;
        if(this.getType().toLowerCase() == "current"){
            this.withdrawalLimit = 20_000_000;
            this.depositLimit = 2_000_000_000;

        }
        if(this.getType().toLowerCase() == "savings"){
            this.withdrawalLimit = 20_000;
            this.depositLimit = 2_000_000_000;

        }
        return true;
    }

    public String accountInfo() {
        String accountName = this.name;
        String accountType = this.type;
        double accountBalance = this.balance;
        return "Name: " + accountName + "\n" + "Type of Account: " +
                accountType + "\n" + "Balance: " + accountBalance ;
    }

    protected String depositFund(double depositAmount){
        if((depositAmount < 1)){
            return "amount not valid";
        }else {
             this.balance += depositAmount;
            return depositAmount + " Deposited";
        }

    }

    protected String withdrawFunds(double withdrawalAmount) {

        if (setLimit()) {
            if (withdrawalAmount >= this.withdrawalLimit) {
                System.out.println(this.withdrawalLimit);
                return "exceeded withdrawal limit ";
            }
            if ((withdrawalAmount > this.balance)) {
                System.out.println(this.balance);
                return "insufficient balance " + this.balance;
            } else {
                 this.balance -= withdrawalAmount;
                return withdrawalAmount + " Approved ";
            }
        }else {
            return "something went wrong";
        }
    }

    protected double checkBalance() {
        return this.balance;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBalance() {
        return balance;
    }

    public double getLimit() {
        return limit;
    }
}
