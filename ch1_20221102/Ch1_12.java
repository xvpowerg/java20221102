/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20221102;

/**
 *
 * @author xvpow
 */
public class Ch1_12 {
    
    public static void main(String[] args) {
        int aqi = 120;
        if (aqi <= 50){
            System.out.println("A");
        }else if(aqi <= 100){
            System.out.println("B");
        }else if(aqi <= 150){
            System.out.println("C");
        }else if(aqi <= 200){         
             System.out.println("D");
        }else if(aqi <= 300){       
            System.out.println("E");
        } else {
             System.out.println("F");
        }
        
        
    }
    
}
