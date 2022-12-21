/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20221221.Ch22_3_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch22_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList();
        list.add(50);
        list.add(25);
        list.add(73);
        list.add(65);
        list.add(32);
        //幫我求大於40 數字總和
        int total = 0;
        for (Integer v : list){
             if (v > 40){
                 total += v;
             }
        }
        
      int total2 = list.stream().filter(v->v>40).mapToInt(v->v.intValue()).sum();
        System.out.println(total);
         System.out.println(total2);
    }
    
}
