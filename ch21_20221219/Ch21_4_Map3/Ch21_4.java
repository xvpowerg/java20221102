/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20221219.Ch21_4_Map3;
import java.util.HashMap;
/**
 *
 * @author xvpow
 */
public class Ch21_4 {

    public static void main(String[] args) {
      HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken", 65);
        map.put("Vivin", 71);
        map.put("Lucy", 68);        
        System.out.println(map);
        System.out.println("=====================");
        //key 存在
        //會執行
        map.compute("Vivin", (key,value)->{
         System.out.println(key+":"+value);
        return 25;//回傳值會寫入map 覆蓋存在的key值
        });
         System.out.println(map);
         //key 存在 不會執行函數
        map.computeIfAbsent("Lucy", (k)->{
           System.out.println("computeIfAbsent:"+k);
            return 75;
        });
       //key 存在 會執行函數
       //return會覆蓋存在的key值
        map.computeIfPresent("Ken", (v1,v2)->{
        System.out.println(v1+":"+v2);
        return 22;
            });
         System.out.println(map);
        //key 不存在 
        //會執行注意v是null
        //Joy會新增至Map
        map.compute("Joy", (k,v)->{
        System.out.println(k+":"+v);
            return 88;
        });
         System.out.println("====================="); 
         System.out.println(map);
       //key不存在會執行
         map.computeIfAbsent("Gigi", (k)->{
             System.out.println("Key:"+k);
         return 65;
         });
           System.out.println(map);
         //key不存在 不會執行   
        map.computeIfPresent("Ben", (k,v)->{
                 System.out.println("Ben!!!");
        return 100;    
        });
       
                 
    }
    
}
