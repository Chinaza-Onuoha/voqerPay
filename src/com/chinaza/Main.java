package com.chinaza;

public class Main {

    public static void main(String[] args) {

        /**
         * Open of account.
         *
         * Requirement
         *
         * account name,
         * type of account(based on the type, the limit of fund will be set).
         * balance(the default balance is zero).
         *
         *
         * POS MACHINE
         * withdrawal
         * check balance
         * deposit
         *
         *
         * */

        Account account = new Account("David Onuoha","current");

//       String accountInfo  = account.accountInfo();
//        System.out.println(accountInfo);

        System.out.println(account.depositFund(50));
        System.out.println(account.depositFund(19950));

        System.out.println(account.withdrawFunds(15_000));



        POS pos = new POS(account);
//
//        System.out.println(pos.depositFund(50,account));
        System.out.println(pos.checkBalance());

    }
}
