/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20221216.ch20_3_set1;
import java.util.HashSet;

/**
 *
 * @author xvpow
 */
public class Ch20_3 {

    //不在意 取出順序 內容不可重複 可用Set
    //Set搜尋快
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> set1 = new HashSet();
        set1.add("Zoom");
        set1.add("Gigi");
        set1.add("Gigi");
        set1.add("Passat");
        set1.add("Ben");
        set1.forEach(v->System.out.println(v));
        
        System.out.println(set1.contains("Passat"));
        System.out.println(set1.contains("Vivin"));
    }
    
}
