/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20221219.Ch21_2_Map1;
import java.util.HashMap;
import java.util.Set;
/**
 *
 * @author xvpow
 */
public class Ch21_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ken", 85);
        map.put("Vivin", 69);
        map.put("Lucy", 83);
        map.put("Lindy", 76);
        Set<String> keySet =   map.keySet();
        for(String key : keySet){
            System.out.println(key+":"+map.get(key));
        }
        System.out.println("===================");
        map.forEach((k,v)->System.out.println(k+":"+v));
        System.out.println("===================");
        map.put("Lucy", 38);                
        System.out.println(map);
        System.out.println("===================");
        if (!map.containsKey("Lindy")){
            map.put("Lindy", 77);
        }
        map.putIfAbsent("Vivin",96);//key存在不寫入
        System.out.println(map);
       Integer v1 =   map.get("Ben");
       System.out.println(v1);//kye不存在得到null
       Integer v2 =   map.get("Lindy");
        System.out.println(v2);        
       Integer v3 = map.getOrDefault("Ben", 0);
        System.out.println(v3);

        
    }
    
}
