/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20221205.ch15_2_innerClass1;
import java.util.function.Predicate;
import java.util.ArrayList;
public class TestInnerClass {
    private ArrayList<String> list = new ArrayList();
    public void add(String s){
        list.add(s);
    }
    public ArrayList<String> filter(int len){
        ArrayList<String> tmp = new ArrayList();
        MyInnerClass myInner = new MyInnerClass(len);
        for (String v : list){
             if (myInner.test(v)){
                tmp.add(v);
            }
        }  
        return tmp;
    }
    
    //內部類 可以使用  可使用所的Modifier     
        private  class MyInnerClass implements  Predicate<String>{
            int len = 0;
            MyInnerClass(int len){
                this.len = len;   
            }
            public boolean test(String v){
                return v.length() > this.len;
            }
        }
}
