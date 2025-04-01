package com.scaler.designpatterns.Adapter;

public class BillPayment {
    public void payBill(int amount,BankAPI bankAPI) {
        if(amount <= bankAPI.getBalance()){
            System.out.println("Successfully paid bill ");
        }else{
            System.out.println("Not enough balance");
        }
        //bankAPI.billPayment(amount);
    }
}
