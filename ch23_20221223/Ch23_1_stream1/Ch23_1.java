/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20221223.Ch23_1_stream1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Stream 分惰性（lazy）方法與終端（terminal）方法
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Vivin");
        list.add("Joy");
        list.add("Lucy");
     long count =    list.stream().filter(                
                v->{
                    System.out.println("Filter:"+v);
                    return v.length() > 3;}).count();
    System.out.println(count);
    }
    
}
