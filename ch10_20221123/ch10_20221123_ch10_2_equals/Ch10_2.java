/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221123_ch10_2_equals;

/**
 *
 * @author xvpow
 */
public class Ch10_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MyNumber num1 = new MyNumber(5);
      MyNumber num2 = new MyNumber(5);   
      System.out.println(num1 == num2);
      System.out.println(num1.equals(num2));
      System.out.println("num1:"+num1);
      System.out.println("num2:"+num2);
    }
    
}
