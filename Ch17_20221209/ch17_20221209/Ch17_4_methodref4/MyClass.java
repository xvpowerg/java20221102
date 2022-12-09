/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20221209.Ch17_4_methodref4;

/**
 *
 * @author xvpow
 */
public class MyClass {
    private String msg;
    public MyClass(){
         this("Def Msg");
     }
    public MyClass(String v){
        this.msg = v;
    }
    public String toString(){
        return this.msg;
    }
}
