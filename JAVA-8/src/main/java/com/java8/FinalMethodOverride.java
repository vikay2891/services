package com.java8;

class A6{

   private void method(){
         System.out.println("hi super class" );
    }
}

/**
 * @author vikas.bhardwaj3
 * 1/29/20209:09 PM2020
 */
public class FinalMethodOverride extends A6{

    private void method(){
        System.out.println("hi sub class");
    }
    public static void main(String[] args) {
        A6 a = new FinalMethodOverride();

    }


}
