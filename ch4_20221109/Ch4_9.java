/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch4_20221109;

/**
 *
 * @author xvpow
 */
public class Ch4_9 {
     //1 一模一樣類型 
     //2 相同類可相容
    //3 不同類型可相容
    //4 封箱類型
    
    static void test1(short s1){
        System.out.println("Test1 short");
    }
    static void test1(int i1){
        System.out.println("Test1 int ");
    }
    static void test2(short s1){
        System.out.println("Test2 short");
    }

    static void test2(float f1){
        System.out.println("Test2 float");
    }
    
     public static void main(String[] args) {
         test1(30);
         short s1 = 30;
         test1(s1);
         test2(6);
     }
}
