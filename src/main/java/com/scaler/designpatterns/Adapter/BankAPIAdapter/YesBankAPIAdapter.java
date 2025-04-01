package com.scaler.designpatterns.Adapter.BankAPIAdapter;

import com.scaler.designpatterns.Adapter.BankAPI;
import com.scaler.designpatterns.Adapter.BankAPIs.YesBankAPI;

public class YesBankAPIAdapter implements BankAPI {
    YesBankAPI yesbankapi=new YesBankAPI();
    @Override
    public void billPayment(int amount) {
        yesbankapi.payBill(amount);
    }

    @Override
    public int getBalance() {
        return yesbankapi.getBalance();
    }
}
