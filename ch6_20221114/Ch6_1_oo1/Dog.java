/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch6_20221114.Ch6_1_oo1;

/**
 *
 * @author xvpow
 */
//繼承不會繼承建構式
//繼承不會繼承 私有的
//繼承不會繼承 看不到的
public class Dog extends  Animal{
    //可傳三參數
    //預設建構式
    Dog(){
       //建構式內沒有自行輸入 this()或super()  
       //預設會呼叫super()
    }
    //name age weight
    Dog(String name,int age,float weight){
        //可呼叫父類別建構式
        //不可與this()同時出現
        super(name,age,weight);
    }
    
    //override 複寫
    //可以改良父類的方法
    public void printInfo(){
        System.out.print("Dog:");
        super.printInfo();
    }
}
