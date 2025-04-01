package com.scaler.designpatterns.Adapter.BankAPIs;

public class YesBankAPI {
    public void payBill(int amount) {
        System.out.println("Successfully payed Bill Amount via YesBank: " + amount);
    }

    public int getBalance(){
        System.out.println("checking balance via YesBank");
        return 100;
    }
}
