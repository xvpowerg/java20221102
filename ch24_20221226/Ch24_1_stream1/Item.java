/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20221226.Ch24_1_stream1;

/**
 *
 * @author xvpow
 */
public class Item {
    private static int count =0;
    private int no;
    private String name;

    public Item(String name) {
        this.name = name;
        no = ++count;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item{" + "no=" + no + ", name=" + name + '}';
    }
    
}
