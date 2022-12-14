/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20221214.ch19_5_List2;

import java.util.ArrayList;

/**
 *
 * @author xvpow
 */
public class Ch19_5 {
    
    public static void main(String[] args) {
           ArrayList<String> list = new ArrayList();
            list.add("Ken");
            list.add("Vivin");
            list.add("Lindy");
          ArrayList<String> list2 = new ArrayList();
            list2.add("Iris");
            list2.add("Joy");
            list2.add("Momo");
            list.addAll(list2);
            System.out.println(list);
            
            list.remove("Vivin");
            System.out.println(list);
            ArrayList<String> delList = new ArrayList();
            delList.add("Joy");
            delList.add("Iris");
            list.removeAll(delList);
            System.out.println(list);
            
            list.add(1, "Yumi");
            System.out.println(list);
            
            int idx1 = list.indexOf("Lindy");//會回傳index 找不到回傳-1
            System.out.println(idx1);
            boolean b1 = list.contains("Yumi");//回傳boolean
            System.out.println(b1);
            
            list.removeIf(s->s.length() == 5);
             System.out.println(list);
            list.replaceAll(st->"Name:"+st);
             System.out.println(list);
             
            ArrayList<Integer> intList = new ArrayList();
            intList.add(25);
            intList.add(61);
            intList.add(73);
            intList.add(88);         
            //intList.remove(61);//錯誤因為index沒有到61
            intList.remove(Integer.valueOf(61));
            System.out.println(intList);
            
            ArrayList<Integer> intList2 = new ArrayList();
            intList2.add(1);
            intList2.add(2);
            intList2.add(3);
            intList2.add(4);  
            intList2.remove(3);
             System.out.println(intList2);
            
    }
    
}
