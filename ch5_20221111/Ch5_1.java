/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20221111;


public class Ch5_1 {
         //1 一模一樣類型 
     //2 相同類可相容
    //3 不同類型可相容
    //4 封箱類型
    static void test1(int v1){
          System.out.println("test1 int");
    }   
    static void test1(float f1){
        System.out.println("test1 float");
    }
    
    
    static void test2(byte b1){
        System.out.println("Test2 byte");
    }
    static void test2(Integer v1){
        System.out.println("Test2 Integer");
    }

    static void test3(byte b1){
        System.out.println("byte b1");
    }
    static void test3(Float f1){
        System.out.println("Float f1");        
    }

    public static void main(String[] args) {
        test1(5.2f);
        test2(20);
        //test3(10);//因為會轉為Integer但是Float不支持Integer
        byte x = 10;
    
        test3((byte)12);
    }
    
}
