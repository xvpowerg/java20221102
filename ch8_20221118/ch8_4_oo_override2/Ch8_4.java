/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20221118.ch8_4_oo_override2;
import ch8_20221118.ch8_3_oo_override1.Test1;
/**
 *
 * @author xvpow
 */
public class Ch8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t3  = new Test3();
        t3.testPublic();
        
        Test3 obj = (Test3)t3;
        obj.testPublic();
        obj.testProtected();
        obj.testDefault();
    }
    
}
