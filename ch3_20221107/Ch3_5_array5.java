/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20221107;

/**
 *
 * @author xvpow
 */
public class Ch3_5_array5 {

    public static void main(String[] args) {
       
        int[][]array2xN = new int[2][];
        array2xN[0] = new int[]{5,6,7};
        System.out.println(array2xN[0][1]);
        System.out.println(array2xN[0][3]);//java.lang.ArrayIndexOutOfBoundsException
        //System.out.println(array2xN[1][0]);//java.lang.NullPointerException
        
        
    }
    
}
