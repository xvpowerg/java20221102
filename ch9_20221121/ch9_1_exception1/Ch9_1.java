/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20221121.ch9_1_exception1;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch9_1 {
    public static void main(String[] args) {
      TestException tex = new TestException();
//      try{
//           tex.testExcepton(true, "MyException");
//      }catch(IOException ex){
//          System.out.println(ex);
//      }

      try{
           tex.testExcepton(false, "MyException");
           tex.testRuntimeException(true, "MyRuntimeException");
           
      }catch(IllegalArgumentException ex){
          System.out.println(ex);
      }catch(IOException ex){
          System.out.println(ex);
      }finally{//一定會執行
           System.out.println("Close!");           
      }
   
    }
    
}
