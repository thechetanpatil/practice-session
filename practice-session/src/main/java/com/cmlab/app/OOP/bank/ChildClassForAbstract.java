package com.cmlab.app.OOP.bank;

public class ChildClassForAbstract extends AbstractAccount{

    @Override
    int withdrawal(int amount) {
        return 0;
    }

    public ChildClassForAbstract(int amount) {
        super(amount);
    }
}
