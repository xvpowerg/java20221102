/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20221205.ch15_2_innerClass1;
import java.util.ArrayList;
/**
 *
 * @author xvpow
 */
public class Ch15_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      TestInnerClass innerClass = new TestInnerClass();
      innerClass.add("Ken");
      innerClass.add("Lucy");
      innerClass.add("Vivin");
      innerClass.add("Joy");
      innerClass.add("Iris");
      innerClass.add("Lindy");
      ArrayList<String> list =  innerClass.filter(3);
      System.out.println(list);
    }
    
}
