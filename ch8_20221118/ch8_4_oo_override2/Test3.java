/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20221118.ch8_4_oo_override2;
import ch8_20221118.ch8_3_oo_override1.Test1;
/**
 *
 * @author xvpow
 */
public class Test3 extends Test1{
      
       public void testPublic(){
           System.out.println("testPublic Test3");
       }
       
       protected void testProtected(){
            System.out.println("testProtected Test3");
       }
       //因為看不到這個類別方法
       void testDefault(){
            System.out.println("testDefault Test3");
       }
   
       private void testPrivate(){
              System.out.println("testPrivate Test3");
       }
}
