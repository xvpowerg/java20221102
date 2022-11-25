/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c11_20221125.ch11_5_abstract1;

/**
 *
 * @author xvpow
 */
public abstract class Animal {
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String toString(){
        return name+":"+age;
    }
}
