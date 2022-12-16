/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20221216.ch20_7_treeSet3;
import java.util.TreeSet;
import java.util.Comparator;
public class Ch20_7 {

  private static class MyComparator implements Comparator<Person>{
      //p1 大於 p2 　回傳正數
      //p1 小於 p2 　回傳負數
      //p1 等於 p2 　回傳０
      public int compare(Person p1,Person p2){
          if(p1.getAge() > p2.getAge()){
              return 1;
          }else if(p1.getAge() < p2.getAge()){
              return -1;
          }
          return 0;
      }
  }
    public static void main(String[] args) {
        Person p1= new Person("Ken",25,176);
        Person p2= new Person("Vivin",25,165);
        Person p3= new Person("Lucy",31,156);
        Person p4= new Person("Joy",31,156);
        Person p5= new Person("Lindy",27,176);
        MyComparator myComp = new MyComparator();
        TreeSet<Person> treeSet = new TreeSet(myComp);
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);
        System.out.println(treeSet);
    }
    
}

