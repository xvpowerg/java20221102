/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20221202.Ch14_3_func_interface3;
import java.util.function.Supplier;
import java.util.Collection;
import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */

class GetMyCollectionArrayList implements Supplier<Collection>{
    public Collection<String> get(){
       return  new ArrayList<String>();
    }
}
public class Ch14_3 {
    static Collection<String> collectionString(String[] values,
            Supplier<Collection> supp){
        Collection<String> coll = supp.get();
        for (String v : values){
            coll.add(v);
        }
        return coll;
    }
    
    public static void main(String[] args) {
       String[] names = {"Ken","Vivin","Lindy","Lucy"};
       GetMyCollectionArrayList getMyCollection = new GetMyCollectionArrayList();
       Collection coll = collectionString(names,getMyCollection);       
      System.out.println(coll);
    }
    
}
