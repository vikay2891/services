package com.oops;

class A11 {

   A11(){
      System.out.println("parent constructor");
   }

   public final void   m1(){
      System.out.println("final method");

   }
   private void method(){
      System.out.println("method a");
   }
   protected void protectedMethod() {
      System.out.println("superclass protected method");
   }

}
class B11 extends A11 {
   B11(){
      System.out.println("child  a constructor");
   }
  private void method(){
      System.out.println(" child method a");
   }

   private void met(){
       System.out.println("bhbhbh");
   }
   protected void protectedMethod() {
      System.out.println("subclass protected method");
   }
}
public class Test {
   public static void main(String args[]) {
     A11 b1 = new B11();
      B11 b = new B11();
      b.protectedMethod();
   }
}