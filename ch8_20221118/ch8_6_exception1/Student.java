/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20221118.ch8_6_exception1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int age;
    //name 長度必須大於0 小於10 不可為null
    //錯誤訊息:錯誤的name
    public void setName(String name)throws Exception{
//        if (name == null || name.isEmpty() || name.length() >=10){
//            System.out.println("錯誤的name");
//            return;
//        }
     if (name == null || name.isEmpty() || name.length() >=10){
           throw new Exception("錯誤的name");
        }
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    
    //age 必須大於5 小於200
    //錯誤訊息:錯誤的age
    public void setAge(int age){
//        if (age < 5 || age > 200){
//            System.out.println("錯誤的age");
//            return;
//        }

 if (age < 5 || age > 200){
     //拋出例外
           throw new RuntimeException("錯誤的age");
        }
        this.age = age;
    }    
    public int getAge(){
        return this.age;
    }
    
    public void printInfo(){
        System.out.println(this.getName()+":"
                         +this.getAge());
    }
}
