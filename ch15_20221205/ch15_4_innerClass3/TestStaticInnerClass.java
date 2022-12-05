/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20221205.ch15_4_innerClass3;

/**
 *
 * @author xvpow
 */
public class TestStaticInnerClass {
    private String msg;
    //無法呼叫外部類非靜態的任何功能
    protected static class MyStaticClass{
        private float offSet = 0.5f;
        MyStaticClass(float offSet){
            this.offSet = offSet;
        }
        
        public String toString(){
            return "offSet:"+offSet;
        }
    }
}
