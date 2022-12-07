/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20221207.Ch16_2_lambda1;

/**
 *
 * @author xvpow
 */
public class Ch16_2 {

    /**
     * @param args the command line arguments
     */
    static void testRun(MyRun myRun){
        myRun.run();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        testRun(new MyRun(){
            public void run(){
                System.out.println("MyRun 1s");                
            }        
        });
        
        testRun(()->{        
            System.out.println("testRun 2s");
        });
    }
    
}
