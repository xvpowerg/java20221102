/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20221116.ch7_2_oo2;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{
    Test2(){   
    
      System.out.println("Test2()");         
    }
    
    Test2(String msg){
        super(10);
        System.out.println(" Test2(String msg)");
    }
    
    Test2(int value,String msg){
        super(msg,value);
        System.out.println("Test2(int value,String msg)");
    }
        
}
