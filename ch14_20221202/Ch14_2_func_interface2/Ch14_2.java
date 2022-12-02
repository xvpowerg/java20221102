/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch14_20221202.Ch14_2_func_interface2;
import java.util.function.Consumer;
class MyAction1 implements Consumer<String>{
    int count = 0;
    public void accept(String str){
        count++;        
        System.out.print(str+" ");
        if (count %2==0){
             System.out.println();
        }
    }
}
public class Ch14_2 {
//Consumer<T>
//Supplier<T>    
// Function<T,​R>
//UnaryOperator<T>
 //Predicate<T>   

    //對每個資料輸出做某件事???
    static void forEach(String[] values,Consumer<String> action){        
        for (String v : values){
            action.accept(v);        
        }
    }
    public static void main(String[] args) {
       String[] names = {"Ken","Vivin","Lucy","Lindy"};
       MyAction1 action = new MyAction1();
       forEach(names,action);
        
    }
    
}
