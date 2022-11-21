/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20221121.ch9_4_override1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    public void testMyException(boolean b1)throws MyException{
        if (b1){
            throw new MyException();
        }
    }
}
