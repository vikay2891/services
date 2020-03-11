package com.DesignPattern.strategyDesignPattern.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author vikas.bhardwaj3
 * 2/17/202010:53 PM2020
 */

public class DebitCard {

    private int amount;
    private String number;
    private String cvc;
    private String date;

    public DebitCard(String number, String cvc, String date) {
        this.amount = 100000;
        this.number = number;
        this.cvc = cvc;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
