 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20221116.ch7_2_oo2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    Test1(){
        this(10);
       System.out.println("Test1()");
    }    
    Test1(int value){
        this("msg",value);
        System.out.println("Test1(int value)");
    }
    
    Test1(String msg,int value){
          System.out.println("Test1(String msg,int value)");
    }
}
