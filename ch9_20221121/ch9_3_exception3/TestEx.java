/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20221121.ch9_3_exception3;

/**
 *
 * @author xvpow
 */
public class TestEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
           throw new Exception("Test Ex");
       }catch(Exception ex){
           System.out.println(ex);
       }
    }
    
}
