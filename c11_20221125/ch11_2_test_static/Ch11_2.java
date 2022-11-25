/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c11_20221125.ch11_2_test_static;

/**
 *
 * @author xvpow
 */
public class Ch11_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestStatic ts1 = new TestStatic();
        System.out.println(ts1.value);
        ts1.testMethod();
        System.out.println("=======================");
        System.out.println(TestStatic.staticValue);
        TestStatic.testStaticFunc();
    }
    
}
