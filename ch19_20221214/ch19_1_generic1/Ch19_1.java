/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20221214.ch19_1_generic1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch19_1 {
        
    //如果參數是泛型 那麼傳入的的泛型必須一樣
    static void test1(ArrayList<Test2> list){
        list.add(new Test2());
        list.add(new Test3());        
    }
    //可輪巡 不可放數值到list 除了null
    //? extends X 傳入參數的泛型可以是 X 或X的子類
    static void test2(ArrayList<? extends Test2> list){
        //list.add(new Test2());
      //  list.add(null);
       // list.add(new Object());
       System.out.println("===================");
       for (Test2 t2 : list){
           System.out.println(t2);
       }
          System.out.println("===================");
    }
      //? super X 傳入參數的泛型可以是 X 或X的父類
    //可輪巡但類型必須是Object 可放數值到list 數值類型為X或 X的子類
    static void test3(ArrayList<? super Test3> list){
        
        list.add(new Test3());
        list.add(new Test4());
        
        for (Object t3 : list){
            System.out.println(t3);
        } 
    }
    public static void main(String[] args) {
      ArrayList<Test1> list = new ArrayList();
      ArrayList<Test2> list2 = new ArrayList();
      ArrayList<Test3> list3 = new ArrayList();
      ArrayList<Test4> list4 = new ArrayList();
      test1(list2);
      
      list2.add(new Test2());
      list2.add(new Test2());
      test2(list2);
      
      list3.add(new Test3());
      list3.add(new Test3());
      test2(list3);
      
      System.out.println("========================Test3========================");
      test3(list);
      test3(list2);
      test3(list3);
      System.out.println("========================Test3========================");
     // test3(list4);
    }
    
}
