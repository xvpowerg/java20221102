/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20221209.Ch17_4_methodref4;
import java.util.function.Supplier;
import java.util.function.Function;
/**
 *
 * @author xvpow
 */
public class Ch17_4 {

    
    static void printMyClass(Supplier<MyClass>smc){
        System.out.println(smc.get());
    }
    static void printMyClass(String msg,Function<String,MyClass>func){
        System.out.println(func.apply(msg));
    }
    public static void main(String[] args) {
       MyClass myClass = new MyClass("MyMsg!!");
       System.out.println(myClass);
       //?????? 可輸出 MyMsg2
       printMyClass(()->new MyClass("MyMsg2"));
       //?????? 可輸出 MyMsg3
       printMyClass("MyMsg3",(m)->new MyClass(m));
       
       printMyClass(MyClass::new);
       printMyClass("MyMsg4",MyClass::new);
    }
    
}
