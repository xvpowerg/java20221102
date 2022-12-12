/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20221212.ch18_2_generic2;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Ken");
        list.add("Lucy");
        list.add("Vivin");
       TesrClass<ArrayList> t1 = new TesrClass(list);
       t1.foreach();
    }
    
}
