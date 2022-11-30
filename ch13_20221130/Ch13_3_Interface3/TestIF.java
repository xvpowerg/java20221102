/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20221130.Ch13_3_Interface3;

/**
 *
 * @author xvpow
 */
public interface TestIF {
   
    static void testStatic(){
       System.out.println("testStatic");
    }
    
    static boolean compare(int v1,int v2){
        return v1 > v2;
    }
}
