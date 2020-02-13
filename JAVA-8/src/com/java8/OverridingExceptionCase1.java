package com.java8;

import java.io.IOException;

class A3{
    void method(){
        System.out.println("HI super class");
    }
}
class B extends A3{
 /*   @Override
    void method() throws IOException {CTE
        System.out.println("Hisub class");
    }*/
}

/**
 * @author vikas.bhardwaj3
 * 1/28/202011:30 PM2020
 */
public class OverridingExceptionCase1 {

    public static void main(String[] args) {
        A3 a3 = new A3();



    }
}
