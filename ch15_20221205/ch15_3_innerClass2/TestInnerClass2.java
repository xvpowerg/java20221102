/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch15_20221205.ch15_3_innerClass2;

/**
 *
 * @author xvpow
 */
public class TestInnerClass2 {
    private String msg;
    private int count = 5;
   public TestInnerClass2(String msg){
        this.msg = msg;
    }
    //內部類可呼叫外部類屬性
    public class MyInner{
        private int count = 27;
        public String toString(){
            return "Msg:"+msg+" Count:"+TestInnerClass2.this.count;
        }
    }
}
