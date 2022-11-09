/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20221109;

/**
 *
 * @author xvpow
 */
public class Ch4_2 {

    static int test2(){
        return 10; //離開函數 或 回傳數值
    }
    static int test3(int x,int y){
        int a = x + y ;
        return a;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int x = test2();
        System.out.println(x);
        int ans = test3(5,2);
        System.out.println(ans);
    }
    
}
