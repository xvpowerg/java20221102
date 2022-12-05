/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20221205.ch15_6_innerClass5;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch15_6 {

    static String intToString(int code,Function<Integer,String> func){
        return func.apply(code);
    }
    
    public static void main(String[] args) {
       String myStr = intToString(72,new Function<Integer,String>(){       
          public String apply(Integer v){
              char myChar = (char)v.intValue();
              return myChar+"";
          }
       });
       System.out.println(myStr);
    }
    
}
