/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20221226.Ch24_5_stream5;
import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch24_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(10);
       list.add(15);
       list.add(21);
       list.add(35);
       list.add(17);
       
      Optional<Integer> op1 = list.stream().reduce((v1,v2)->{
           System.out.println(v1+":"+v2);
           return v1+v2;
       });
      op1.ifPresentOrElse((v)->System.out.println(v), 
              ()->{System.out.println("Empty");});
      System.out.println("========================");
      int ans = list.stream().reduce(13, (v1,v2)->{
          System.out.println(v1+":"+v2);
          return v1+v2;
      });
      System.out.println(ans);
     System.out.println("========================");
    int ans2 =  list.stream().parallel().reduce(2, (v1,v2)->{
         System.out.println("reduce1:"+v1+":"+v2);
     return v1+v2;
     }, (v1,v2)->{
             System.out.println("reduce2:"+v1+":"+v2);
       return v1 + v2;      
     });
      System.out.println(ans2);
    }
    
}
