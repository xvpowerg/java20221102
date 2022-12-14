/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch19_20221214.ch19_3_enum;

/**
 *
 * @author xvpow
 */
public class Ch19_3 {

    enum Fruit{
        APPLE,
        BANANA,
        KIWI
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Fruit f1 = Fruit.BANANA;
        switch(f1){
            case APPLE:
                System.out.println("蘋果");
                break;
            case BANANA:
                System.out.println("香蕉");
                break;
            case KIWI:
                System.out.println("奇異果");
                break;
        }
        
        
        System.out.println(Fruit.BANANA.getClass().getName());
         Fruit f2 =Fruit.valueOf("KIWI");
         System.out.println(f2);
         for (Fruit f3 : Fruit.values()){
            System.out.println(f3);
         }
         System.out.println("===========================");
         System.out.println(Fruit.BANANA.name());
         System.out.println(Fruit.BANANA.ordinal());
         System.out.println(Fruit.KIWI.ordinal());
         
    }
    
}
