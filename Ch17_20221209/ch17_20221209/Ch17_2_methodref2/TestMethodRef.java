/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20221209.Ch17_2_methodref2;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.ArrayList;
public class TestMethodRef {
    private ArrayList<Integer> dataList = new ArrayList<>();
    public void add(int v){
        dataList.add(v);
    }
    private void testRef(Predicate<Integer> myP,Consumer<Integer> myC){
        for (int v : dataList){
            if (myP.test(v)){
                 myC.accept(v);
            }
        }
    }
    
    private boolean test(Integer v){
        return v > 25;
    }
    private void print(Integer v){
        System.out.println(v);
    }
    public void run(){
        testRef(this::test,this::print);
    }
}
