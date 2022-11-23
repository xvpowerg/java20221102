/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221123_ch10_6_initblock3;

/**
 *
 * @author xvpow
 */
public class TestBlockOrder {
    {
        System.out.println("Step 1");
    }
    
    public TestBlockOrder(){
        System.out.println("TestBlockOrder()");
    }
    
    static{
        System.out.println("static Step 1");         
    }
    
    {
        System.out.println("Step 2");
    }
      
      static{
        System.out.println("static Step 2"); 
    }
    
}
