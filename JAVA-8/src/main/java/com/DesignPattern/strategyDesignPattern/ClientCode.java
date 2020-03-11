package com.DesignPattern.strategyDesignPattern;

import com.DesignPattern.strategyDesignPattern.model.Order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vikas.bhardwaj3
 * 2/17/202011:08 PM2020
 */
public class ClientCode {

    static InputStream in;
    private static Map<Integer, Integer> productPrice = new HashMap<>();
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
    private static Order order = new Order();
    private static PaymentStrategy paymentStrategy;

    static {
        productPrice.put(1, 1100);
        productPrice.put(2, 1200);
        productPrice.put(3, 1300);
        productPrice.put(4, 1400);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.print("Please, select a product:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(bufferedReader.readLine());
                cost = productPrice.get(choice);
                System.out.println("count:");
                int count = Integer.parseInt(bufferedReader.readLine());
                order.setCost(cost * count);
                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = bufferedReader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));
            // Client creates different strategies based on input from user,
            // application configuration, etc.
            if (paymentStrategy == null) {
                System.out.println("Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Debit Card");
                String paymentMethod = bufferedReader.readLine();
                if (paymentMethod.equals("1")) {
                    paymentStrategy = new PayPalStrategy();
                } else {
                    paymentStrategy = new DebitCradStrategy();
                }
                // Order object delegates gathering payment data to strategy
                // object, since only strategies know what data they need to
                // process a payment.
                order.processOrder(paymentStrategy);
                System.out.print("Pay " + order.getCost() + " units or Continue shopping? P/C: ");
                String proceed = bufferedReader.readLine();
                if (proceed.equalsIgnoreCase("P")) {
                    // Finally, strategy handles the payment.
                    if (paymentStrategy.pay(order.getCost())) {
                        System.out.println("Payment has successfull order placed");
                    } else {
                        System.out.println("Payment has failed");
                    }
                }
            }
        }
    }

}
