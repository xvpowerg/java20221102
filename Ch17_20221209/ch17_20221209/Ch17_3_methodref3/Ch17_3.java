/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20221209.Ch17_3_methodref3;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch17_3 {

  static void testRef(String v,Function<String,Integer> func){
      System.out.println(func.apply(v));
  }
    public static void main(String[] args) {
        // TODO code application logic here
        
        testRef("123456",String::length);
    }
    
}
