/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20221107;
/**
 *
 * @author xvpow
 */
public class Ch3_8_boxing {

    public static void main(String[] args) {
        // TODO code application logic here
        //基本型態變物件 就是封箱類型
     
        //整數   封箱
        //byte   Byte
        //short Short
        //int  Integer
        //long  Long
        
        //浮點數 封箱
        //float  Float
        //double Double
        
        //布林    封箱
        //boolean Boolean
        
        
         int value1 = 15;
         Integer intObj = Integer.valueOf(value1);//封箱
          System.out.println(intObj);//印出的是字串
        int myValue = intObj.intValue();
        System.out.println(myValue);
        
        Integer intObj2 = 35;
        int value2 = intObj2;//自動解封箱
        int value3 = intObj2 + 5;//自動解封箱
        System.out.println(intObj+":"+value2+":"+value3);
        
       Integer intObj3 = null;
       int value4 = intObj3 + 5;
       System.out.println(value4);
        
    }
    
}
