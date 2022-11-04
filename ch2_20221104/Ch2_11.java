/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20221104;

/**
 *
 * @author xvpow
 */
public class Ch2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int max = 1024;
        int x = 2;
        int count = 1;
        while(x != max){
            x *= 2;
            count++;
        }
        System.out.println(count);
        
    }
    
}
