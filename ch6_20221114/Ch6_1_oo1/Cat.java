/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20221114.Ch6_1_oo1;

/**
 *
 * @author xvpow
 */
public class Cat extends Animal {
    Cat(){        
    }
    
    Cat(String name,int age,float weight){
        super(name,age,weight);
    }
    
    //@Override  提醒是否正確複寫
    @Override
    public void printInfo(){
        System.out.print("Cat:");
        super.printInfo();
    }
}
