/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20221118.ch8_7_exception2;

/**
 *
 * @author xvpow
 */
public class TestException {
    public void testException(boolean e) throws Exception{
        if (e){
            throw new Exception("測試例外");
        }
    }
}
