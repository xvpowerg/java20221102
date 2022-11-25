/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c11_20221125.ch11_2_test_static;

/**
 *
 * @author xvpow
 */
public class TestStatic {
    static  String staticValue = "Static";
    String value = "notStatic";
    static void testStaticFunc(){
        System.out.println("testStaticFunc");
    }
    void testMethod(){
        System.out.println("testMethod");
    }
}
