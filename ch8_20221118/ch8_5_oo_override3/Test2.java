/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20221118.ch8_5_oo_override3;

/**
 *
 * @author xvpow
 */
public class Test2 extends Test1 {
    //複寫基本型態必須一樣
       public float testFloat(){
           return 10;
       } 
       
       public Test2 testObj(){
           return new Test2();
       }
     @Override
     public void testMethod(int value){
        
    }
       //以下都是參數類型必須一樣才是複寫的測設
       //@Override
      public void testMethod(float value){
        
    }
     // @Override
      public void testMethodObj(Test2 value){
        
        }
}
