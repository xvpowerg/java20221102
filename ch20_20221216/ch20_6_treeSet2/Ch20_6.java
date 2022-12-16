/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20221216.ch20_6_treeSet2;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch20_6 {
    public static void main(String[] args) {
        Item i1 = new Item("A1",100);
        Item i2 = new Item("B2",100);
        Item i3 = new Item("C3",65);
        Item i4 = new Item("D4",72);
        Item i5 = new Item("E5",65);
        
        TreeSet<Item> set1 = new TreeSet();
        set1.add(i1);
        set1.add(i2);
        set1.add(i3);
        set1.add(i4);
        set1.add(i5);
        
        System.out.println(set1);
        
    }
    
}
