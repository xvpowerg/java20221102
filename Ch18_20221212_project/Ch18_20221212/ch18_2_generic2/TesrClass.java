/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch18_20221212.ch18_2_generic2;
import java.util.List;

/**
 *
 * @author xvpow
 */
public class TesrClass<T extends List> {
    private T myList;
    TesrClass(T myList){
        this.myList = myList;
    }
    
    public void foreach(){
        myList.forEach((v)->System.out.println(v));
    }
}
