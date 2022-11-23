/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221123_ch10_1_tostring;

/**
 *
 * @author xvpow
 */
public class Person extends Object {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+":"+age;
    }
}
