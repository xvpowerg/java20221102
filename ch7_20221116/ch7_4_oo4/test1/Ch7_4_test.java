/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20221116.ch7_4_oo4.test1;
import ch7_20221116.ch7_4_oo4.TestModifier;
/**
 *
 * @author xvpow
 */
public class Ch7_4_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //類別如果跨package 必須import 才能使用
        TestModifier tmo1= new TestModifier();
        System.out.println(tmo1.publicValue);
         System.out.println("====================");
        Test1 t1 = new Test1();
        t1.printValues();
    }
    
}
