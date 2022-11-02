/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20221102;

/**
 *
 * @author xvpow
 */
public class Ch1_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
       final var KEY_A = 1;//常數不可修改的數
       final var KEY_B = 2;
       final var KEY_C = 3;
         int a = KEY_C;
        switch(a){//byte short int char String Enum
            case KEY_A://變數必須是常數
                System.out.println("A");
                break;
            case KEY_B:
                System.out.println("B");
                break;
            case KEY_C:
                System.out.println("C");
                break;
            default:
                System.out.println("E");
               break; 
        }
        
        
    }
    
}
