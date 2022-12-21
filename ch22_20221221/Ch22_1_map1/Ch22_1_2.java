/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20221221.Ch22_1_map1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author xvpow
 */
public class Ch22_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Student st1 = new Student("Ken",56);
       Student st2 = new Student("Vivin",72);
       Student st3 = new Student("Lucy",83);
       Student st4 = new Student("Iris",59);
       Student st5 = new Student("Lindy",60);
       Student st6 = new Student("Joy",93);
       Student st7 = new Student("Ben",86);
       ArrayList<Student> list = new ArrayList();
       list.add(st1);
       list.add(st2);
       list.add(st3);
       list.add(st4);
       list.add(st5);
       list.add(st6);
       list.add(st7);
         HashMap<Integer,ArrayList<Student>> groupMap = new HashMap();
            for(Student tmpSt : list){
                   int key = tmpSt.getScore()/10;
                   key *= 10;
               //key存在
            groupMap.computeIfPresent(key, (k,v)->{
                        v.add(tmpSt);
                        return v;            
                        }
                    );
             //key不存在
             groupMap.computeIfAbsent(key, (k)->{
               ArrayList<Student> tmplist = new   ArrayList();
               tmplist.add(tmpSt);
               return tmplist;
             });
  
            }
            System.out.println(groupMap);
    }
    
}
