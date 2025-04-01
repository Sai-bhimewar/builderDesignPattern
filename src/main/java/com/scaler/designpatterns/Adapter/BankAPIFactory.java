package com.scaler.designpatterns.Adapter;

import com.scaler.designpatterns.Adapter.BankAPIAdapter.ICICIBankAPIAdapter;
import com.scaler.designpatterns.Adapter.BankAPIAdapter.YesBankAPIAdapter;
import com.scaler.designpatterns.Adapter.BankAPIs.YesBankAPI;

public class BankAPIFactory {
    public static BankAPI getBankAPI(String bankName) {
        if(bankName.equals("YesBank")) {
            return new YesBankAPIAdapter();
        }else if(bankName.equals("ICICI")) {
            return new ICICIBankAPIAdapter();
        }
        return null;
    }
}
