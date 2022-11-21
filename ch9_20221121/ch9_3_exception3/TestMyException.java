/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20221121.ch9_3_exception3;

/**
 *
 * @author xvpow
 */
public class TestMyException {
    public void testAgeException(boolean b1,String msg)throws AgeException{
        if (b1){
            throw new AgeException(msg);
        }
    }
    
    public void testNameException(boolean b2,String msg){
        if (b2){
            throw new NameException(msg);
        }        
    }
}
