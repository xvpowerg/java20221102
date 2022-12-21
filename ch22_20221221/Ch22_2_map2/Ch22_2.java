/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20221221.Ch22_2_map2;
import java.util.TreeMap;
/**
 *
 * @author xvpow
 */
public class Ch22_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TreeMap 是用key排序
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(10, "Ken");
        treeMap.put(6, "Vivin");
        treeMap.put(2, "Lindy");
        treeMap.put(5, "Iris");
        System.out.println(treeMap);
        
    }
    
}
