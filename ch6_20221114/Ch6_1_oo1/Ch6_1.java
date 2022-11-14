/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20221114.Ch6_1_oo1;

/**
 *
 * @author xvpow
 */
public class Ch6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Animal a1 = new Animal();
     a1.setAge(5);
     a1.setWeight(15);
     a1.setName("momo");
     a1.printInfo();
     
     Animal a2 = new Animal("Nana",2,6);
     a2.printInfo();
     Animal a3 = new Animal();
     a3.printInfo();
     
     Dog d1 = new Dog();
     d1.setName("Lulu");
     d1.setAge(1);
     d1.setWeight(2);
     d1.printInfo();
    }
    
}
