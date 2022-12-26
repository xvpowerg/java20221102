/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20221226.Ch24_2_stream2;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
public class Ch24_2 {

    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList();
        list.add("Ken");
       list.add("ViVin");
       list.add("Lucy");
       list.add("Joy");
       list.add("Iris");
       Map<Integer,String> lenMap=  list.stream().collect(Collectors.toMap(st->st.length(), 
                st->st.toUpperCase(),
                (v1,v2)->{                    
                        System.out.println("v1:"+v1+"v2:"+v2);
                        return v1+","+v2;
                }
                            
                        ));
      System.out.println(lenMap);
        
    }
    
}
