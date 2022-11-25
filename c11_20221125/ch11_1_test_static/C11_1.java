/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c11_20221125.ch11_1_test_static;

/**
 *
 * @author xvpow
 */
public class C11_1 {
    
    
    public static void main(String[] args) {
      Fruit fr1 = new Fruit("Apple",25);
      Fruit fr2 = new Fruit("Banana",15);
      System.out.println(fr1);
      System.out.println(fr2);
      fr1.name = "Kiwi";
      fr1.count = 2;
      fr2.price = 95;
      
       System.out.println("==================");
       System.out.println(fr1);
      System.out.println(fr2);
    }
    
}
