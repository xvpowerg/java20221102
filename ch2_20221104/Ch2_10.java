/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20221104;

/**
 *
 * @author xvpow
 */
public class Ch2_10 {
    
    static int test1(){
        System.out.println("test1");
        return 1;
    }
    static boolean test2(){
        System.out.println("test2");
        return true;
    }
    static void test3(){
        System.out.println("test3");
    }
    
    public static void main(String[] args) {
 // 1 2 4
 // 3 2 4
        for (int i = test1();i<=3 && test2();i++,test3()){
            System.out.println("Body!!");
        }
        // TODO code application logic here
    }
    
}
