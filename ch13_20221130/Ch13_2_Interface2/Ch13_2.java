/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20221130.Ch13_2_Interface2;

/**
 *
 * @author xvpow
 */
public class Ch13_2 {
    
    static void foreach(MyIterator it){
        //有下一筆嗎 hashNext()
        //有下一筆就往下一筆走next()
        //沒有就停止
        while(it.hasNext()){
            Object v = it.next();
            System.out.println(v);
        }
        
    }
  
    public static void main(String[] args) {
        // TODO code application logic here
        MyList myList = new MyList();
      myList.add("Ken");
      myList.add("Vivin");
      myList.add("Lindy");
      
      System.out.println(myList.get(0));
      System.out.println(myList.get(1));
      System.out.println(myList.get(2));
      System.out.println("===========================");
//      System.out.println(myList.get(-1));
      foreach(myList);
      
    }
    
}

