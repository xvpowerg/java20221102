/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch2_20221104;

/**
 *
 * @author xvpow
 */
public class Ch2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for (int i =1; i <= 4;i++){
            System.out.println("Start:"+i);
            for (int k = 1; k<=3;k++){
               
//               if (i == 2){
//                    System.out.print("C:"+k+" ");
//                     continue;                
//               } 
                System.out.print(i+":"+k+" ");
                if (i == 2){
                    break;
                }
            }          
            System.out.println();
            System.out.println("End:"+i);
        }
        
        
    }
    
}
