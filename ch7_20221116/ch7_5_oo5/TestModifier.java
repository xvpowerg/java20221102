/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20221116.ch7_5_oo5;

/**
 *
 * @author xvpow
 */
public class TestModifier {
    public void testPublic(){
        System.out.println("testPublic");
    }    
    protected void testProtected(){
        System.out.println("testProtected");
    }    
    void testDefault(){
           System.out.println("testDefault");
    }
    private void testPrivate(){
           System.out.println("testPrivate");
    }
}
