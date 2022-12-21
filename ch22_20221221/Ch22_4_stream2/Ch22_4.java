/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20221221.Ch22_4_stream2;
import java.util.ArrayList;
import java.util.stream.Stream;
/**
 *
 * @author xvpow
 */
public class Ch22_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList();
        list.add("Ken");
        list.add("Vivin");
        list.add("Iris");
        list.add("Lucy");
        list.add("Joy");
        Stream<String> st1 = list.stream();
        //同一個Stream只能用一次
        st1.filter(s->s.length() > 3);
        //st1.count();
        //Stream不會改變來源
         list.stream().filter(v->v.length() > 3).forEach(v->System.out.println(v));
        System.out.println(list);
    }
    
}
