/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20221226.Ch24_3_stream3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch24_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Student st1 = new Student("Ken",60);
            Student st2 = new Student("Vivin",75);
            Student st3 = new Student("Joy",86);
            Student st4 = new Student("Iris",63);
            Student st5 = new Student("Lucy",54);
            Student st6 = new Student("Ben",77);
            Student st7 = new Student("Yume",83);
            ArrayList<Student> list = new ArrayList();
            list.add(st1);
            list.add(st2);
            list.add(st3);
            list.add(st4);
            list.add(st5);
            list.add(st6);
            list.add(st7);
            
        Map<Integer,List<Student>> groupMap=
                list.stream().collect(Collectors.groupingBy(st->st.getScore()/10));
        System.out.println(groupMap);
  Map<Integer,Long> groupMap2=
                list.stream().collect(Collectors.groupingBy(st->st.getScore()/10,
                        Collectors.counting()));
                        System.out.println(groupMap2);
                        
   Map<Boolean,List<Student>>  pMap = 
           list.stream().collect(Collectors.partitioningBy(v->v.getScore() >= 60));
   System.out.println(pMap);
    }
    
}
