/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch6_20221114.Ch6_1_oo1;

/**
 *
 * @author xvpow
 */
public class Ch6_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int type = 1;
       Animal a1 = null;
       switch(type){
           case 1:
             a1 = new Dog("Bibi",2,3);
             break;
           case 2:
             a1 =  new Cat("Kiki",3,5);  
             break;
       }
       a1.printInfo();
    }
    
}
