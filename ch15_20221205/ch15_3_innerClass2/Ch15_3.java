/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20221205.ch15_3_innerClass2;

/**
 *
 * @author xvpow
 */
public class Ch15_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TestInnerClass2 inner2 = new TestInnerClass2("MyInnerMsg");
       
       TestInnerClass2.MyInner myInner = inner2.new MyInner();
        System.out.println(myInner);
    }
    
}
