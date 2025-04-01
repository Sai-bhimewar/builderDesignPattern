package com.scaler.designpatterns.Adapter;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the name of an ICICIBank/YesBank");
        String bankName=scanner.nextLine();
        BankAPI bankAPI=BankAPIFactory.getBankAPI(bankName);
        PhonePe phonePe = new PhonePe(bankAPI);
        //phonePe.payBill(50);
        phonePe.recharge(60);
    }
}
