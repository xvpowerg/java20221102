/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20221130.Ch13_1_Interface1;

/**
 *
 * @author xvpow
 */
public interface Fly {
    void flying();
    //希望呼叫另一個介面的抽象時使用default函數
    public default void drive(){
        flying();
        System.out.println("Driving");
    }
}
