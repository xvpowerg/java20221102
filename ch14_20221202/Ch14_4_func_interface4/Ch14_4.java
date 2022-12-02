/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20221202.Ch14_4_func_interface4;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */

class StringToLen implements Function<String,Integer>{
  
    public Integer apply(String v){
        return v.length();
    }
}

class StringToUp implements Function<String,String>{
    public String apply(String v){
        return v.toUpperCase();
    }    
}

//class StringToLower implements Function<String,String>{
//    public String apply(String v){
//        return v.toLowerCase();
//    }    
//}
public class Ch14_4 {

    static List stringToIntList(String[] values,Function<String,Integer> func){
        List<Integer> list = new ArrayList();
        for (String v : values){
            list.add(func.apply(v));
        }
        return list;
    }
    
    static List stringToUpList(String[] values,Function<String,String> func){
        List<String> list = new ArrayList();
        for (String v : values){
            list.add(func.apply(v));
        }
        return list;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String[] values = {"Ken","Howard","Iris"};
        StringToLen stToLen = new StringToLen();
        List list = stringToIntList(values,stToLen);
        System.out.println(list);
       
        StringToUp strToUp = new StringToUp();
        List upList = stringToUpList(values,strToUp);
        System.out.println(upList);
        
    }
    
}
