/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20221109;

/**
 *
 * @author xvpow
 */
public class Ch4_8 {
    static void test1(String s1){
        s1 = "GHJ";
    }
    public static void main(String[] args) {
      //不可修改
        String s1 = "ABCD";       
        System.out.println(s1);
        s1.toLowerCase();
        System.out.println(s1);
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        
       String st1 = "RTY";
       test1(st1);
       System.out.println(st1);
    }
    
}
