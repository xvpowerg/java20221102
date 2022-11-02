/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20221102;

/**
 *
 * @author xvpow
 */
public class Ch1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score = 70;
        
//        if (score >= 60){
//            System.out.println("Pass");
//        }else{
//            System.out.println("Fail");
//        }
        var msg = score >= 60? "Pass" : "Fail";
        System.out.println(msg);


        
    }
    
}
