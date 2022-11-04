/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20221104;
import java.util.Arrays;

public class Ch2_14 {
    public static void main(String[] args) {
        
        int[] array1 = new int[7];
        array1[0] =5;
        array1[1] =10;
        array1[4] =7;
        array1[6] =13;
        
        for(int i = 0; i < array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println("");         
        //foreach
        for(int v : array1){
           System.out.print(v+" ");
        }
          System.out.println("");          
        Arrays.stream(array1).forEach(System.out::println);
    }
    
}
