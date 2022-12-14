/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch19_20221214.ch19_2_generic2;
import java.util.function.Consumer;
import java.util.List;
/**
 *
 * @author xvpow
 */
public class Test1 {
    static <T> T test1(T v){
        return v;
    }
    
    static <T> void test2(List<T> list,Consumer<T> c){
        for(T v : list){
            c.accept(v);
        }
    }
}
