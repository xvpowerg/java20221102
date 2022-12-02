/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20221202.Ch14_1_func_interface1;

/**
 *
 * @author xvpow
 */
public class Ch14_1 {

    static void testRun(MyRun myrun){
        myrun.runing();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        MyRun runFunc = new MyRunFunc();
        testRun(runFunc);
        
    }
    
}
