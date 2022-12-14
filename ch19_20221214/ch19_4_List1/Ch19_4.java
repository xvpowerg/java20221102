/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20221214.ch19_4_List1;
import java.util.ArrayList;
public class Ch19_4 {

  
    public static void main(String[] args) {
            ArrayList<String> list = new ArrayList();
            list.add("Ken");
            list.add("Vivin");
            list.add("Lindy");
        list.forEach(v->System.out.println(v));
        System.out.println("=================");
        for (int  i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        
    }
    
}
