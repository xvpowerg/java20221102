/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20221107;
import java.util.Arrays;
public class Ch3_7_array7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {31,7,36,15,23};
        Arrays.sort(array);
        for (int v :array){
            System.out.print(v+" ");
        }
        System.out.println();
        int index = Arrays.binarySearch(array, 15);
        System.out.println(index);
        //找不到一定負數
        //小於所有-1
        index = Arrays.binarySearch(array, 2);
        System.out.println(index);
        //大於所有 (長度+1)*-1
        index = Arrays.binarySearch(array, 72);
        System.out.println(index);
        //在中間 右邊數值長度 *-1
       index =  Arrays.binarySearch(array, 26);
       System.out.println(index);
    }
    
}
