package com.chinaza;

public class POS  {
     Account account;


    public POS(Account account){
       this.account = account;

    }


    public boolean validateAccount(Account account){
        boolean isValid = false;
        if(account.getType().toLowerCase() == "current" || account.getType().toLowerCase() == "savings") {
             isValid = true;
        }
        return isValid;
    }

    protected String depositFund(double depositAmount,Account account) {
         validateAccount(account);
         return account.depositFund(depositAmount);
    }




    protected String withdrawFunds(double withdrawalAmount) {
        return this.account.withdrawFunds(withdrawalAmount);
    }


    protected double checkBalance() {
        return this.account.checkBalance();
    }
}
