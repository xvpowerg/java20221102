/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20221109;

/**
 *
 * @author xvpow
 */
public class Ch4_7 {

    static void swap(int[] array1){
        int a1 = array1[0];
        array1[0] = array1[1];
        array1[1] = a1;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] array1 = {2,5};
        swap(array1);//call by reference
        System.out.println(array1[0]+":"+array1[1]);
    }
    
}
