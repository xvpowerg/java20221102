/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20221130.Ch13_5_Interface5;

/**
 *
 * @author xvpow
 */
public interface Test2IF extends Test1IF {
     default  void myDef(){
        System.out.println("Test2IF");
    }
}
