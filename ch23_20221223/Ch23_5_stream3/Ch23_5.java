/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20221223.Ch23_5_stream3;

import java.util.ArrayList;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Ch23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList();
     list.add("Ken");
     list.add("Vivin");
     list.add("Lindy");
     list.add("Joy");
     list.add("Vivin");
     list.add("Lindy");
     //去除重複
     list.stream().distinct().forEach(v->System.out.println(v));
     System.out.println("=====================");
     //都會找第一個因為不是所以findAny 跟findFirst是一樣的
     Optional<String> op1 =  list.stream().findAny();
     Optional<String> op2 = list.stream().findFirst();
     Optional<String> op3 = list.stream().parallel().findAny();
     System.out.println(op1.get());
     System.out.println(op2.get());
     System.out.println(op3.get());
      System.out.println("=====================");
     //顯示前3個
     list.stream().limit(3).forEach(v->System.out.println(v));
           System.out.println("=====================");
    //跳過前3個
     list.stream().skip(3).forEach(v->System.out.println(v));
      System.out.println("=====================");
     //map 轉換 到另一個類型
     list.stream().map(st->st.toUpperCase()).forEach(v->System.out.println(v));
     //map 轉換成基本型態可用mapToxxx
      System.out.println("=====================");
     int sum =  list.stream().mapToInt(v->v.length()).sum();
     System.out.println(sum);
    }
    
}
