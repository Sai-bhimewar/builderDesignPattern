package com.scaler.designpatterns.Adapter.BankAPIs;

public class ICICIBankAPI {
    public void payBill(int amount){
        System.out.println("paying bill with ICICIBankAPI: "+amount);
    }

    public int getBalance(){
        System.out.println("checking balance via ICICIBankAPI");
        return 100;
    }
}
