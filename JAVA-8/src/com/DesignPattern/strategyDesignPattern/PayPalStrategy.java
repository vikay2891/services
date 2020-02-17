package com.DesignPattern.strategyDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vikas.bhardwaj3
 * 2/17/202010:11 PM2020
 */
public class PayPalStrategy implements PaymentStrategy {
    InputStream in;
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
    private Map<String, String> databse = new HashMap<>();
    private String userName;
    private String password;
    private boolean signedIn;

    @Override
    public void collectPaymentDetails() {

        try {
            if (!signedIn) {
                System.out.println("Please enter username");
                userName = bufferedReader.readLine();
                System.out.println("Please enter password");
                password = bufferedReader.readLine();
                if (verify()) {
                    System.out.println("Data verifcation is sucessfull");
                } else {
                    System.out.println("wrong username of password");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private boolean verify() {
        setSignedIn(userName.equals(databse.get(userName)));
        return signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;

    }

    @Override
    public boolean pay(int amount) {
        if (signedIn) {
            System.out.println("Paying" + amount + "usingpaypal");
            return  true;
        } else
        return false;
    }
}
