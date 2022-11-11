/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch5_20221111.ch5_4_oo2;

/**
 *
 * @author xvpow
 */
public class Ch5_4 {

    //Encapsulation 封裝
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        //age >=0 age <= 200
       // p1.age = 3000000;
       p1.setAge(3000);
        p1.id = "A12";
        //not null >1 <60
        p1.setName(null);
        //  大於0 小於10000 
        p1.weight = 45;
        p1.printInfo();
        
    }
    
}
