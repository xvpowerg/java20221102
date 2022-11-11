/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20221111;

/**
 *
 * @author xvpow
 */
public class Ch5_2 {
     //1 一模一樣類型 
     //2 相同類可相容
    //3 不同類型可相容
    //4 封箱類型
    static void test1(int v1,int v2){
        System.out.println("test1 int int");
    }

    static void test1(float v1,int v2){
        System.out.println("test1 float int");
    }
    static void test2(float f1,int v2){
        System.out.println("float int");
    }
    static void test2(int v1,float f2){
        System.out.println("int float");
    }
    
    static void test3(float f1,int v2){
        System.out.println("float int");
    }
    static void test3(Integer v1,float v2){
        System.out.println("Integer float");
    }
    public static void main(String[] args) {
        test1(2,6);
        test1(2.5f,3);
        //test2(5,6);
        test2(5f,6);        
        test3(10,5);//有基本型態會先選基本型態
        
    }
    
}
