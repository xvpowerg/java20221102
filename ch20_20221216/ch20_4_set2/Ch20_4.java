/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20221216.ch20_4_set2;
import java.util.HashSet;
/**
 *
 * @author xvpow
 */
public class Ch20_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Ken");
        Student st2 = new Student("Vivin");
        Student st3 = new Student("Lindy");
        Student st4 = new Student("Vivin");
        Student st5 = new Student("Iris");
        HashSet<Student> set1 = new HashSet();
        set1.add(st1);
        set1.add(st2);
        set1.add(st3);
        set1.add(st4);
        set1.add(st5);
        set1.forEach(v->System.out.println(v));
        System.out.println(st2.equals(st4));
    }
    
}
