/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20221107;

/**
 *
 * @author xvpow
 */
public class Ch3_1_array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array2x3 = new int[2][3];
        array2x3[0][1] = 25;
        array2x3[1][0] = 16;
        array2x3[1][1] = 50;
//        System.out.println(array2x3.length);
//        System.out.println(array2x3[1].length);
        
        for (int i = 0; i < array2x3.length; i++){
            for (int k = 0; k < array2x3[i].length; k++){
                System.out.print(array2x3[i][k]+" ");
            }
            System.out.println();
        }
        
        //foreach
        for(int[] v1 : array2x3){
            for (int v2 : v1){
                System.out.print(v2+" ");
            }
            System.out.println();
        }
    }
    
}
