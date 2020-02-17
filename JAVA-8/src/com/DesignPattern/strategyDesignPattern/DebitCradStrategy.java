package com.DesignPattern.strategyDesignPattern;

import com.DesignPattern.strategyDesignPattern.model.DebitCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author vikas.bhardwaj3
 * 2/17/202010:51 PM2020
 */
public class DebitCradStrategy implements PaymentStrategy {


    InputStream in;
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

    private DebitCard debitCard;


    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter Card number");
            String number = bufferedReader.readLine();
            System.out.println("Enter cvc number");
            String cvc = bufferedReader.readLine();
            System.out.println("Enter date ");
            String date = bufferedReader.readLine();
            debitCard = new DebitCard(number, cvc, date);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean pay(int amount) {
        if (debitCard != null) {
            System.out.println("Paying amount" + amount + "using credit card");
            debitCard.setAmount(debitCard.getAmount() - amount);
            return true;
        }
        return false;
    }


}
