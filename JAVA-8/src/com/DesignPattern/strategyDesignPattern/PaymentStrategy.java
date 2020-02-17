package com.DesignPattern.strategyDesignPattern;

/**
 * @author vikas.bhardwaj3
 * 2/17/202010:08 PM2020
 */
public interface PaymentStrategy {

    /**
     * This methos is used to pay amount
     * @param amount
     * @return
     */
    boolean pay(int amount);

    /**
     * This method is used to get paymentDetails
     */
    void collectPaymentDetails();
}
