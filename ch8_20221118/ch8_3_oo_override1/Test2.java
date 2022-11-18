/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20221118.ch8_3_oo_override1;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //只能是public 
    public void testPublic(){
        System.out.println("Test2 Public");
    }
    //public protected
    protected void testProtected(){
       System.out.println("Test2 Protected");
    }
    //public protected default
    void testDefault(){
        System.out.println("Test2 Default"); 
    }
   // @Override
    private void  testPrivate(){
        System.out.println("Test2 Private"); 
    }
}
