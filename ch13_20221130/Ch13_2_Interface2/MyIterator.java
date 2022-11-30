/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ch13_20221130.Ch13_2_Interface2;

/**
 *
 * @author xvpow
 */
public interface MyIterator<T> {
    boolean hasNext();
    T next();
    
    default void foreach(){
        //有下一筆嗎 hashNext()
        //有下一筆就往下一筆走next()
        //沒有就停止
        while(hasNext()){
            Object v = next();
            System.out.println(v);
        }
        
    }
}
