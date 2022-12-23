/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20221223.Ch23_2_option1;

/**
 *
 * @author xvpow
 */
public class Ch23_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st1 = new Student();
       // st1.setName("Ken");

        if ( st1.getName().isPresent() ){
            if (st1.getName().get().length() > 3){
                System.out.println("Pass");    
            }else{
                System.out.println("Fail");    
            }
            
        }
    }
    
}
