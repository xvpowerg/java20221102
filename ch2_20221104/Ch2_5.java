/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20221104;

/**
 *
 * @author xvpow
 */
public class Ch2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        for (int i = 2;i<=100;i++){
            x *= i;
            if (x >=100){
                break;
            }
        }
        System.out.println(x);
        
    }
    
}
