/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221123_ch10_2_equals;

/**
 *
 * @author xvpow
 */
public class MyNumber {
    private int number;
    public MyNumber(int number){
        this.number = number;
    }
    public String toString(){
        return "MyNumber:"+this.number;
    }
    public boolean equals(Object obj){
      MyNumber tmp = (MyNumber) obj;
      return this.number == tmp.number;
    }
}
