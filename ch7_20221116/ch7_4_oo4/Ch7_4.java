/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch7_20221116.ch7_4_oo4;

/**
 *
 * @author xvpow
 */
public class Ch7_4 {

    /*
       1  Modifier 只能越來越開放 不能越來越封閉
       2 回傳值如是基本型態 必須一樣  
       3 回傳值如是參考型態 可一樣或子類  
       4 方法名稱傳入參數必須一樣 
       5 拋出例外可選 一樣 拋出子類 或不拋
        
    */
    
 
    public static void main(String[] args) {
       TestModifier tmod1 = new TestModifier();
       System.out.println(tmod1.publicValue); 
       System.out.println(tmod1.protectedValue); 
       System.out.println(tmod1.defaultValue); 
         
    }
    
}
