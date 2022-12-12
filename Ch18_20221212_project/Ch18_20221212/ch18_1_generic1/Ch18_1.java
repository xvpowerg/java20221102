/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch18_20221212.ch18_1_generic1;

/**
 *
 * @author xvpow
 */
public class Ch18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MyList strList = new MyList();
      strList.add("Ken");
      strList.add("Vivin");
      strList.add("Lucy");
      System.out.println(strList.get(1));
      
      strList.foreach(v->System.out.println(v));
      
      MyList<Integer> intList = new MyList();
      intList.add(25);
      intList.add(31);
      intList.add(72);
      intList.add(55);
      intList.foreach(v->System.out.println(v));
    }
    
}
