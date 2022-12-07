/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20221207.Ch16_4_lambda3;

/**
 *
 * @author xvpow
 */
public class Ch16_4 {

    /**
     * @param args the command line arguments
     */
    static void testLambda2(int v,TestLambda2 t){
        t.test(v);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        testLambda2(15,(int v)->{        
                for (int i = 1;i<= v;i++){
                    System.out.print(i+" ");
                }
                    System.out.println();
        });
        
        testLambda2(6,x->{
            for(int i = 1;i<=30;i++){
                if (i%6==0){
                    System.out.print(i+" ");
                }               
            }
              System.out.println();
        });                
        
        testLambda2(25,x->System.out.println(x>=60?"Pass":"Fail"));
    }
    
}
