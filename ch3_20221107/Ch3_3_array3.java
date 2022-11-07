/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20221107;

/**
 *
 * @author xvpow
 */
public class Ch3_3_array3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array2xN = new int[2][];
        array2xN[0] = new int[]{5,6,1,2};
        array2xN[1] = new int[]{1,8};
        
        for (int[] v1: array2xN){
            for (int v2 : v1){
                System.out.print(v2+" ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
