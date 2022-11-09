/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20221109;

/**
 *
 * @author xvpow
 */
public class Ch4_6 {
    static void swap(int a,int b){
        int c = a;
        a = b;
        b = c;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        String s1 = "Test1";
        String s2 = "Test2";
//        int c = a;
//        a = b;
//        b = c;
        swap(a,b);//call by value
        System.out.println(a+":"+b);
    }
    
}
