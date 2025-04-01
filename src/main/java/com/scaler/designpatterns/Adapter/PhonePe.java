package com.scaler.designpatterns.Adapter;

public class PhonePe {
    private BankAPI bankAPI;
    private FastTagRecharge fastTagRecharge;
    private BillPayment billPayment;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
        this.fastTagRecharge = new FastTagRecharge();
        this.billPayment = new BillPayment();
    }

    public void recharge(int amount) {
        fastTagRecharge.recharge(amount, bankAPI);
    }
    public void payBill(int amount) {
        billPayment.payBill(amount, bankAPI);
    }
}
