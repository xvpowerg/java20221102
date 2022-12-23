/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20221223.Ch23_4_stream2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     ArrayList<String> list = new ArrayList();
     list.add("Ken");
     list.add("Vivin");
     list.add("Lindy");
     list.add("Joy");
     //所都條件都成立
     boolean b1 = list.stream().allMatch(p->p.length() > 2);
     System.out.println("All:"+b1);
     //某條件成立
     boolean b2 = list.stream().anyMatch(p->p.length() > 3);
     System.out.println("Any:"+b2);
     boolean b3 = list.stream().noneMatch(p->p.length() < 2);
     System.out.println("none:"+b3);
     
     //短路
     //allMatch 只要一個條件不合就短路
     list.stream().allMatch(v->{
         System.out.println("allMatch:"+v);
     return v.length() > 3;
     });
      System.out.println("========================");
      //allMatch 只要一個條件合就短路
       list.stream().anyMatch(v->{
       System.out.println("anyMatch:"+v);
       return v.length() > 3;       
       });
        //noneMatch 只要一個條件合就短路
        System.out.println("========================");
          list.stream().noneMatch(v->{
       System.out.println("noneMatch:"+v);
       return v.length() > 3;       
       });
    }
    
}
