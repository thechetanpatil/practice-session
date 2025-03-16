package com.cmlab.app.OOP.bank;

public abstract class AbstractAccount {

    private int amount;

    //abstract method
     abstract int withdrawal(int amount);

     //non abstract method
     String getAccDetails(){

         //logic for returning the account details
         return "ok";
     }

    public AbstractAccount(int amount) {
        this.amount = amount;
    }
}
