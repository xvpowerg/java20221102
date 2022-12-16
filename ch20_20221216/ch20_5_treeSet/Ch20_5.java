/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20221216.ch20_5_treeSet;
import java.util.TreeSet;
/**
 *
 * @author xvpow
 */
public class Ch20_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TreeSet<Integer> set1 = new TreeSet();
        //預設小到大排序
        set1.add(10);
        set1.add(5);
        set1.add(7);
        set1.add(2);
        set1.add(3);
        set1.add(5);
        set1.forEach(v->System.out.println(v));
        System.out.println("===========================");
        System.out.println(set1.first());
        System.out.println(set1.last());
        System.out.println("===========================");
         System.out.println(set1.higher(5));//>5
         System.out.println(set1.ceiling(5));//>= 5
        System.out.println("===========================");
        System.out.println(set1.lower(3)); //< 3
        System.out.println(set1.floor(3));//<=3
    }
    
}
