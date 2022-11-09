/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20221109;

/**
 *
 * @author xvpow
 */
public class Ch4_3 {

//     static int  sum( int v1,int v2){
//         return v1 + v2;
//     }
     //長參數
    //長參數 只能放在 最後一個位置
     static int sum(int ... v){
         int result = 0;
         for (int a : v){
             result += a;
         }
         return result;
     }
      //長參數 只能放在 最後一個位置
     static void test1(int v1,int ... v2){
         
     }
//     static void test2(int ... v2,int v1){
//         
//     }
    public static void main(String[] args) {
        int ans = sum(2,5);
        System.out.println(ans);
        ans = sum(3,2,1,6,8,9);
         System.out.println(ans);
         ans = sum();
          System.out.println(ans);
    }
    
}
