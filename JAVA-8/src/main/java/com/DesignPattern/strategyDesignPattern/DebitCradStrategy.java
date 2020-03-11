package com.DesignPattern.strategyDesignPattern;

import com.DesignPattern.strategyDesignPattern.model.DebitCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

/**
 * @author vikas.bhardwaj3
 * 2/17/202010:51 PM2020
 */
public class DebitCradStrategy implements PaymentStrategy {


    InputStream in;
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));

    private DebitCard debitCard;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DebitCradStrategy)) return false;
        DebitCradStrategy that = (DebitCradStrategy) o;
        return Objects.equals(in, that.in) &&
                Objects.equals(bufferedReader, that.bufferedReader) &&
                Objects.equals(debitCard, that.debitCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(in, bufferedReader, debitCard);
    }

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
