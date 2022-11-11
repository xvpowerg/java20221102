/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20221111.ch5_4_oo2;

/**
 *
 * @author xvpow
 */
public class Person {
   private String name="未設定";
    String id;
    //封裝第一步
    //private 只能在Person內部使用
   private int age;
    float weight;
    void printInfo(){
        System.out.println(getName()+":"+id+":"+getAge()+":"+weight);
    }
    //存
    public void setAge(int inAge){
        //把關
        if (inAge <  0 || inAge > 200){
            System.out.println("錯誤的年齡");
           return;//離開函數不繼續
        }
        age = inAge;
    }
    //提
    public int getAge(){
        return age;
    }
    
    public  void setName(String inName){        
        if(inName == null || inName.isEmpty() || inName.length() > 60){
            System.out.println("錯誤的姓名格式");
            return;
        }
        name = inName;
    }
    public String getName(){
        return name;
    }
}
