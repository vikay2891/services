package com.java8;

class A7{
    public void method(){
        System.out.println("hi super class");
    }
}

/**
 * @author vikas.bhardwaj3
 * 1/29/20209:35 PM2020
 */
public  abstract class NonAbstractMethod extends A7{

     public abstract void method();

    public static void main(String[] args) {
        A7 a = new NonAbstractMethod() {
            @Override
            public void method() {

            }
        };
    }
}
