/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20221104;

/**
 *
 * @author xvpow
 */
public class Ch2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             tag1:
         for (int i =1; i <= 4;i++){
            System.out.println("Start:"+i);
            for (int k = 1; k<=3;k++){
                System.out.print(i+":"+k+" ");
                if (i == 2){
                    continue tag1;
                }
            }          
            System.out.println();
            System.out.println("End:"+i);
        }
    }
    
}
