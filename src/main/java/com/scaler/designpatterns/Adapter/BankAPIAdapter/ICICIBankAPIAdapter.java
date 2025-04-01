package com.scaler.designpatterns.Adapter.BankAPIAdapter;

import com.scaler.designpatterns.Adapter.BankAPI;
import com.scaler.designpatterns.Adapter.BankAPIs.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPI {
    ICICIBankAPI icicibankapi=new ICICIBankAPI();
    @Override
    public void billPayment(int amount) {
        icicibankapi.payBill(amount);
    }

    @Override
    public int getBalance() {
        return icicibankapi.getBalance();
    }
}
