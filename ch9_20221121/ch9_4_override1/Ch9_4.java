/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20221121.ch9_4_override1;

/**
 *
 * @author xvpow
 */
public class Ch9_4 {

   
    public static void main(String[] args) {
            Test1 t2 = new Test2();
            try{
              t2.testMyException(true);    
            }catch(MyException ex){           
                System.out.println(ex);
            }
          
    }
    
}
