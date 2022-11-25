/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c11_20221125.ch11_1_test_static;

/**
 *
 * @author xvpow
 */
public class Fruit {
     String name;
     int price;
    static int count;//是共享 
    //static 屬於類別
    public Fruit(String name,int price){
        this.name = name;
        this.price = price;
        count++;
    }
    
    public String toString(){
        return name+":"+price+":"+count;
    }
}
