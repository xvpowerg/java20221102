/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20221118.ch8_1_oo1;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String msg;
// Test1(){
//        
//    }
    private Test1(String msg){
        this.msg = msg;
    }
    
    public static Test1 newTest1(String msg){
        return new Test1(msg);
    }
    
    public void printMsg(){
        System.out.println(msg);
    }
}
