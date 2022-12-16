/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20221216.ch20_1_List1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Item i1 = new Item(1,"Item1");
      Item i2 = new Item(2,"Item2");
      Item i3 = new Item(3,"Item3");
      Item i4 = new Item(4,"Item4");
      Item del = new Item(3,"Item3");
      
      ArrayList<Item> itemList = new ArrayList();
      itemList.add(i1);
      itemList.add(i2);
      itemList.add(i3);
      itemList.add(i4);
      itemList.forEach(v->System.out.println(v));
      System.out.println("====================");
      itemList.remove(del);
      itemList.forEach(v->System.out.println(v));
      
    }
    
}
