/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221123_ch10_3_equals2;

/**
 *
 * @author xvpow
 */
public class Ch10_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Item i1 = new Item("IPhone 14",10);
       Item i2 = new Item("IPhone 14",10);
       Item i3 = new Item("IPhone 15",10);
       String msg = "Test";
       System.out.println(i1);
       System.out.println(i2);
       System.out.println(i3);
       
      System.out.println(i1.equals(i2));       
       System.out.println(i1.equals(i3));
       System.out.println(i1.equals(null));
       System.out.println(i1.equals(msg));
    }
    
}
