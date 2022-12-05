/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20221205.ch15_1_function1;
import java.util.ArrayList;
import java.util.function.Predicate;
class MyStrLenFilter implements Predicate<String>{
    private int condition = 0;
    MyStrLenFilter(){
        
    }
    MyStrLenFilter(int condition){
        this.condition = condition;
    }
    public boolean test(String v){
        return v.length()  > condition;
    }
}
public class Ch15_1 {
    static ArrayList filter(ArrayList<String> list,Predicate<String> p){
        ArrayList<String> newList = new ArrayList();
        for (String st : list){
            if (p.test(st)){
                  newList.add(st);
            }
        }
        return newList;
    }
    
    public static void main(String[] args) { 
      ArrayList<String> list = new ArrayList();
      list.add("Ken");
      list.add("Vivin");
      list.add("Lucy");
      list.add("Joy");
      list.add("Iris");
      MyStrLenFilter filter = new MyStrLenFilter(3);
       ArrayList<String> newList = filter(list,filter);
       System.out.println(newList);
        
    }
    
}
