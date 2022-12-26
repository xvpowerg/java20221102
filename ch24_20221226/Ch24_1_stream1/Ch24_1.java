/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20221226.Ch24_1_stream1;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.stream.Collectors;
public class Ch24_1 {

    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>();
       list.add("Ken");
       list.add("ViVin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Iris");
      //list.stream().map(Item::new).forEach(v->System.out.println(v));
      //如何變成List
//     List<Item> itemList =  
//              list.stream().map(Item::new).collect(Collectors.toList());
//     System.out.println(itemList);
       HashSet<Item> itemSet =  
               list.stream().map(Item::new).
                       collect(Collectors.toCollection(HashSet::new));
      System.out.println(itemSet);
     
    }
    
}