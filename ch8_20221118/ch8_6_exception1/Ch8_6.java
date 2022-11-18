/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20221118.ch8_6_exception1;

/**
 *
 * @author xvpow
 */
public class Ch8_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        Student st1 = new Student();
        st1.setName("Ken");
        st1.setAge(10);
        System.out.println(st1.getName()+":"+st1.getAge());
        Student st2 = new Student();
        st2.setName("1234567890011");
        st2.setAge(-50);
        st2.printInfo();
    }
    
}
