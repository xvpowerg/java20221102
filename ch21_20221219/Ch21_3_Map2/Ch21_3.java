/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20221219.Ch21_3_Map2;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch21_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      HashMap<String,Integer> map1 = new HashMap<>();
      map1.put("Ken", 25);
      map1.put("Vivin", 76);
      System.out.println(map1);
      //kye存在
      //v1 原本mpa的數值
      //v2 新加入mpa的數值
      //回傳值會引響map的value
      map1.merge("Vivin", 82, (v1,v2)->{
            System.out.println(v1+":"+v2);            
            return v2 > v1?v2:v1;
      });
      System.out.println("============================");
         System.out.println(map1);
      System.out.println("============================");     
      //kye不存在 value直接寫入map
     map1.merge("Ben", 81, (v1,v2)->{
     System.out.println(v1+":"+v2);
     return v2;
     });
             System.out.println(map1);
    }
    
}
