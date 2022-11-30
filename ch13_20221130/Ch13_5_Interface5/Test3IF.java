/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20221130.Ch13_5_Interface5;

/**
 *
 * @author xvpow
 */
public interface Test3IF extends Test1IF,Test2IF{
    //1 不要有重複的default方法
    //2 Test3IF 再寫一個default 蓋過Test1IF Test2IF 重複的方法   
    //3 Test2IF 去繼承 Test1IF 這樣就可覆蓋Test1IF的default方法
//    default void myDef(){
//        System.out.println("Test3IF myDef");        
//    }
}
