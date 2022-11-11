/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20221111.ch5_3_oo1;

/**
 *
 * @author xvpow
 */
public class Ch5_3 {
    public static void main(String[] args) {
      Student st1 = new Student();//new　建立一個物件
      st1.name = "Ken";
      st1.age = 25;
      st1.height = 176;
     // System.out.println(st1.name+":"+st1.age+":"+st1.height);
     st1.showInfo();
     Student st2 = new Student();
     st2.name = "Vivin";
     st2.age = 16;
     st2.height = 162;
     st2.showInfo();
     //System.out.println(st2.name+":"+st2.age+":"+st2.height);
      
        
    }
    
}
