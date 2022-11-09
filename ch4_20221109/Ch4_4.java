/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20221109;

/**
 *
 * @author xvpow
 */
public class Ch4_4 {
//一定要有一個明確的遞迴結束點
//遞迴次數不可太長   
    static void test1(int n){
        System.out.println("T:"+n);
        if (n < 3){
           test1(n + 1); 
        }
        System.out.println("E:"+n);
    }
    static void test2(int i){
        System.out.println(i);
        if (i < 13220){
          test2(i + 1);  
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //test1(1);
//      for (int i = 1; i <= 11120;i++){
//          System.out.println(i);
//      }
        test2(1);
    }
    
}
