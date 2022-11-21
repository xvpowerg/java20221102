/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20221121.ch9_1_exception1;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class TestException {
    public void testExcepton(boolean b1,String msg)throws IOException{
        if (b1){
            throw new IOException(msg);
        }
    }
    
    public void testRuntimeException(boolean b1,String msg){
        if (b1){
            throw new IllegalArgumentException(msg);
        }
    }
}
