package com.cmlab.app.OOP.bank;

public class AccountTest {

    public static void main(String[] args) {

        //here Savings account is implementing/inheriting Account class/interface
        //hence we can store object of SavingsAccount(child class) to Account(parent clasd)

        Account savingsAccount = new SavingsAccount();
        savingsAccount.withdrowal(100);
        savingsAccount.diposit(120);

        //we can not instantiate/ create object of abstract class / interface
        // however we can create object of non-abstract class which is child of abstract class
        // so the below operation not allowed(compilation error: 'Account' is abstract; cannot be instantiated)
//        Account ac = new Account();
        AbstractAccount abc = new AbstractAccount();
    }
}
