/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20221116.ch7_1_oo1;

/**
 *
 * @author xvpow
 */
public class Test1{
    Test1(){
        this(20,"Hello");
        System.out.println("Test1()");
    }
    
    Test1(String msg){
       System.out.println("String msg"); 
    }
    
    Test1(int value1,String msg){
        this(msg);
        System.out.println("int value1,String msg"); 
    }
    

}
