/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221123_ch10_3_equals2;

/**
 *
 * @author xvpow
 */
public class Item {
    private String name;
    private int price;
    public Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return name+":"+price;
    }
    public boolean equals(Object obj){
//        if (obj == null || obj.getClass().getName().
//                          equals(this.getClass().getName()) == false ){
//            return false;
//        }

      if (obj == null || !(obj instanceof  Item)){
            return false;
        }
        //只要price 一樣就回傳true
        Item tmp =   (Item)obj;
        return this.price==tmp.price && 
               this.name.equals(tmp.name);
    }
}
