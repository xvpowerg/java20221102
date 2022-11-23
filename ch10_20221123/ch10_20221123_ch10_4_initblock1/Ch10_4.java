/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20221123_ch10_4_initblock1;

/**
 *
 * @author xvpow
 */
public class Ch10_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestBlock testb = new TestBlock();
        System.out.println(testb.find("Ken"));
        TestBlock testb2 = new TestBlock(10);
        testb2.find("Vivin");
          
    
    }
    
}
