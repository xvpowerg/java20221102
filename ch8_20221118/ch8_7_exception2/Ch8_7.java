/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20221118.ch8_7_exception2;

/**
 *
 * @author xvpow
 */
public class Ch8_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestException te = new TestException();
        
        try{
            te.testException(true);
            System.out.println("Group");
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
        System.out.println("Other!");
    }
    
}
