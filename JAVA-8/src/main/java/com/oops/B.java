package com.oops;

/**
 * @author vikas.bhardwaj3
 * 2/25/20204:57 PM2020
 */

class A{
    protected void  display(){
        System.out.println("display parent");

    }

    private  void hello(){
        System.out.println("Hello parent");
    }

    void kaju(){
        System.out.println("parent kaju");
    }

}
public class B extends  A{

    public static void main(String[] args) {

        A a = new B();

    }


}
