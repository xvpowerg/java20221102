/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20221104;

/**
 *
 * @author xvpow
 */
public class Ch2_1 {

    public static void main(String[] args) {
     
        var st1  = "Ken";
        var st2 = "Lucy";
        var st3 = "Ken";
        var st4 = new String("Ken");
        System.out.println(st1);
        System.out.println(st4);
        
        System.out.println(st1 == st2);
        System.out.println(st1 == st3);
        System.out.println(st4 == st1);
       System.out.println("==============================");
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st4.equals(st1));
     System.out.println("=============================="); 
     String v5 = null;
     System.out.println(v5.equals(st1));
        
    }
    
}
