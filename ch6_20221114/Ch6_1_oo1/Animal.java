/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20221114.Ch6_1_oo1;

/**
 *
 * @author xvpow
 */
public class Animal {
    private String name;
    private int age;
    private float weight;
    Animal(){     
        //this()呼叫其他的建構式 
        //只是建構式當中的第一筆數值
        this("未設定",-1,-1);        
    }
    Animal(String name,int age,float weight){        
        this.setName(name);
        this.setAge(age);
        this.setWeight(weight);        
    }
    public String getName(){
        return name;
    }   
    //this. 表示當前物件
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight = weight;        
    }
    
    public void printInfo(){
        System.out.println(getName()+":"+getAge()+":"+getWeight());
    }
}
