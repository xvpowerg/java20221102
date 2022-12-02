/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch14_20221202.Ch14_1_func_interface1;

/**
 *
 * @author xvpow
 */
public class MyRunFunc implements MyRun{
    public void runing(){
        for (int i = 1;i<=10;i++){
            System.out.println("Run:"+i);
        }
    }
}
