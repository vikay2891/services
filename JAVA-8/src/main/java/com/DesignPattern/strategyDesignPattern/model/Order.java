package com.DesignPattern.strategyDesignPattern.model;

import com.DesignPattern.strategyDesignPattern.PaymentStrategy;

/**
 * @author vikas.bhardwaj3
 * 2/17/202011:06 PM2020
 */

/**
 * Order class. Doesn't know the concrete payment method (strategy) user has
 * picked. It uses common strategy interface to delegate collecting payment data
 * to strategy object. It can be used to save order to database.
 */
public class Order {

    private int cost;
    private boolean isClosed;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = true;
    }

    public void processOrder(PaymentStrategy paymentStrategy) {
        paymentStrategy.collectPaymentDetails();
    }
}
