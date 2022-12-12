/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tw.com.m4.test4;
import tw.com.m3.TestM3;
import tw.com.m1.test1.TestM1;
import tw.com.m2.test2.TestM2;
/**
 *
 * @author xvpow
 */
public class Test4Main {
    public static void main(String[] args) {
        TestM3 tm3 = new TestM3();
        TestM1 tm1 = new TestM1();
        TestM2 tm2 = new TestM2();
       tm3.showTest1(tm1);
       tm3.showTest2(tm2);        
    }
    
}

