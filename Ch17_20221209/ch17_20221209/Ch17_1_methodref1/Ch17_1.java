/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20221209.Ch17_1_methodref1;
import java.util.function.Function;
import java.util.ArrayList;
import java.util.Random;
public class Ch17_1 {
    static ArrayList<String> intMapToString(ArrayList<Integer> data,
            Function<Integer,String> func){
        ArrayList<String> tmp = new ArrayList<>();
        for(Integer v : data){
              String str = func.apply(v);
              tmp.add(str);
        }
      return tmp;
    }
    private static String intMapToStringFunc(Integer i){
                Random ran = new Random();
               int myCase = ran.nextInt(2);
           i = i % 26;
           switch(myCase){
               case 0:
                   return (char)('A'+i)+"";
               case 1:
                   return (char)('a'+i)+"";    
               default:
                   return 0+"";  
           }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<Integer> dataList = new ArrayList<>();
       Random ran = new Random();
       dataList.add(25);
       dataList.add(12);
       dataList.add(17);
       dataList.add(31);       
     ArrayList<String> simple1 =  intMapToString(dataList,(i)->{
           int myCase = ran.nextInt(2);
           i = i % 26;
           switch(myCase){
               case 0:
                   return (char)('A'+i)+"";
               case 1:
                   return (char)('a'+i)+"";    
               default:
                   return 0+"";  
           }            
       });     
     //method reference
     System.out.println(simple1);
      ArrayList<String> simple2 =  intMapToString(dataList,Ch17_1::intMapToStringFunc);
            System.out.println(simple2);
    }
    
}
