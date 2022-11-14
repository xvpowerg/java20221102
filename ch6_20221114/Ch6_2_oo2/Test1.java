/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20221114.Ch6_2_oo2;

/**
 *
 * @author xvpow
 */
public class Test1 {
    private String value1;
    Test1(){
        this("Empty");
    }
    Test1(String value1){
        this.value1 = value1;
    }
    public String getValue1(){
        return value1;
    }
    
    public void setValue1(String value1){
        this.value1 = value1; 
    }
    
    public void printInfo(){
        System.out.println(this.value1);
    }
}
