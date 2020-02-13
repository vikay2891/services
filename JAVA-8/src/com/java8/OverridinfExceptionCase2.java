package com.java8;

class A5 {
    void show() {
        System.out.println("hhhih");
    }
}

class Subclass extends A5 {
    @Override
    void show() throws ArrayIndexOutOfBoundsException {
        System.out.println("jklhljhljhljh");
        super.show();
    }
}

/**
 * @author vikas.bhardwaj3
 * 1/28/202011:35 PM2020
 */
public class OverridinfExceptionCase2 {
    public static void main(String[] args) {
        A5 a = new Subclass();
        a.show();
    }
}
