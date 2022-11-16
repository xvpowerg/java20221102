/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20221116.ch7_5_oo5.test2;
import ch7_20221116.ch7_5_oo5.TestModifier;
import ch7_20221116.ch7_5_oo5.Test1;
import ch7_20221116.ch7_5_oo5.TestProtected2;
import ch7_20221116.ch7_5_oo5.Test3;
public class Ch7_5_2 {
    public static void main(String[] args) {
       TestModifier tm2 = new TestModifier();
       tm2.testPublic();
       System.out.println("=============================");
       Test2 t2 = new Test2();
       t2.testPrint();
       Test1 t1  = new Test1();
       //protected default無法垮package new
      //TestProtected2 t2_2 = new TestProtected2();
      MyClass1 myclass1 = new MyClass1();
      //default無法垮package new
    //  Test3 tedt3 = new Test3();
    }    
}
