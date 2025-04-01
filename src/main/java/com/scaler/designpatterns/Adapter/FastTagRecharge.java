package com.scaler.designpatterns.Adapter;

public class FastTagRecharge {
    public void recharge(int amount,BankAPI bankAPI) {
        if(amount <= bankAPI.getBalance()) {
            System.out.println("Successfully recharged ");
        }else{
            System.out.println("Not enough balance");
        }
    }
}
