/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20221207.Ch16_1_innerclass1;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.ArrayList;
public class Ch16_1 {

    static void foreach(ArrayList<String> list,Consumer<String> com){
        for (String v : list){
            com.accept(v);
        }
    }
    //Predicate 大於25顯示
    static void filter(ArrayList<Integer> list,Predicate<Integer> p){
        for (Integer v : list){
            if (p.test(v)){
                System.out.println(v+" ");
            }
        }
    }
    public static void main(String[] args) {
        
    ArrayList<Integer> list2 = new ArrayList<>();
    list2.add(15);
    list2.add(37);
    list2.add(66);
    list2.add(45);
    list2.add(29);
    list2.add(18);
    list2.add(75);
    filter(list2,new Predicate<Integer>(){    
    public boolean test(Integer v){
        return v > 25;
    }
    });    
        
        
      ArrayList<String> list = new ArrayList<>();
      list.add("Ken");
      list.add("Vivin");        
      list.add("Lucy");
      list.add("Iris");
      list.add("Joy");
      list.add("Ben");
      
      //匿名內部不可修改區域變數
      foreach(list,new Consumer<String>(){
          int count = 1;
          public void accept(String s){
              System.out.print(s+" ");
              if (count % 2==0){
                  System.out.println();
              }
              count++;
          }
      });
      

         
    }
    
}

