/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20221216.ch20_6_treeSet2;

/**
 *
 * @author xvpow
 */
public class Item implements Comparable<Item>{
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", price=" + price + '}';
    }
    public int compareTo(Item it){
        //如果目前大於傳入回傳正數
        //如果目前小於傳入回傳負數
        //如果目前等於傳入回傳0
        if (this.price > it.price){
            return 1;
        }else if(this.price < it.price){
            return -1;
        }
        return this.name.compareTo(it.name);
    }
    
}
