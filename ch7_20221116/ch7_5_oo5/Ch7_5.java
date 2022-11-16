/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20221116.ch7_5_oo5;

/**
 *
 * @author xvpow
 */
public class Ch7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     TestModifier tm2 = new TestModifier();
     tm2.testPublic();
     tm2.testProtected();
     tm2.testDefault();
     Test1 t1 = new Test1();
     TestProtected2 t2 = new TestProtected2();
     Test3 t3 = new Test3();
    }
    
}
