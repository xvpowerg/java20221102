/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20221221.Ch22_2_map2;
import java.util.TreeMap;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch22_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Comparator<Item> itemCmp = Comparator.<Item,Integer>comparing((v)->v.getPrice());
      itemCmp = itemCmp.thenComparing(it->it.getName());
        TreeMap<Item,String> tMap = new TreeMap<>(itemCmp);
        Item i1 = new Item("Item1",25);
        Item i2 = new Item("Item2",25);
        Item i3 = new Item("Item3",56);
        Item i4 = new Item("Item4",62);
        Item i5 = new Item("Item5",88);
        Item i6 = new Item("Item6",18);
        Item i7 = new Item("Item7",88);
        tMap.put(i1, "V1");
        tMap.put(i2, "V2");
        tMap.put(i3, "V3");
        tMap.put(i4, "V4");
        tMap.put(i5, "V5");
        tMap.put(i6, "V6");
        tMap.put(i7, "V7");
        System.out.println(tMap);
    }
    
}
