/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20221207.Ch16_3_lambda2;

/**
 *
 * @author xvpow
 */
public class Ch16_3 {
        
    
   static  void testFunc(TestFunction myFunc){
        myFunc.func();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      testFunc(()->System.out.println("Test1 Func")); 
      testFunc(()->{
                System.out.println("Test2 Func");
                System.out.println("Test3 Func");
              }); 
        
    }
    
}
