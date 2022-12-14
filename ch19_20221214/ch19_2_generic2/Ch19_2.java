/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20221214.ch19_2_generic2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_2 {
    public static void main(String[] args) {
        String v = Test1.test1("AA");
        System.out.println(v);
        
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Ken");
        strList.add("Vivin");
        strList.add("Lucy");
        Test1.test2(strList, (String str)->
                System.out.println(str));
        
    }
    
}
