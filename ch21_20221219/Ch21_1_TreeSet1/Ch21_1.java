/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch21_20221219.Ch21_1_TreeSet1;
import java.util.TreeSet;
import java.util.Comparator;
/**
 *
 * @author xvpow
 */
public class Ch21_1 {

    public static void main(String[] args) {
        Comparator<Student> comp1 = 
                Comparator.<Student,Integer>comparing(st->st.getScore1());
         Comparator<Student> comp2 = comp1.thenComparing(st->st.getScore2()).
                thenComparing(st->st.getScore3()).
                thenComparing(st->st.getName());
        
        TreeSet<Student> set1 = new TreeSet<>(comp2.reversed());
        Student st1 = new Student("Ken",85,65,72);
        Student st2 = new Student("Vivin",71,85,63);
        Student st3 = new Student("Joy",85,72,96);
        Student st4 = new Student("Lucy",85,65,93);
        Student st5 = new Student("Iris",71,85,63);
        
      
        set1.add(st1);
        set1.add(st2);
        set1.add(st3);
        set1.add(st4);
        set1.add(st5);
        
        System.out.println(set1);
        
    }
    
}


