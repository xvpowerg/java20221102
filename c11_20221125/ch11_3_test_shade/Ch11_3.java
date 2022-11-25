/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c11_20221125.ch11_3_test_shade;

/**
 *
 * @author xvpow
 */
public class Ch11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //遮蔽看類別
        //複寫看物件
        //遮蔽 1 靜態或非靜態的屬性  2 靜態的函數
            Test1 t1 = new Test2();
            
            t1.printInfo();
            t1.testStatic();//遮蔽
            //Test1.testStatic();
            System.out.println(t1.msg);
         
    }
    
}
