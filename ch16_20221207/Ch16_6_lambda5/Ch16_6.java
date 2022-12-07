/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20221207.Ch16_6_lambda5;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch16_6 {
    static void testLambda4(int v1,String v2,TestLambda4 lambda4){
               String result =  lambda4.testLambda(v1, v2);
               System.out.println(result);
    }
    public static void main(String[] args) {
      
        testLambda4(5,"Ken",(int c,String msg)->{
                String rsult = "";
                for (int i = 1;i<=c;i++){
                    rsult += msg+" ";
                }
                return rsult;
        });
        //一個以上的參數 必須加上()
        testLambda4(5,"Iris",(c,msg)->{
            Random ran= new Random();
            String rsult = msg;
                for(int i = 1;i<=c;i++){
                    rsult+=":"+ran.nextInt();
                }
            return rsult;    
        });
        int count = 10;
        TestLambda4 lambda4 = (c,msg)->{
            Random ran= new Random();
            //不可再lambda改變區域變數
            //count = 10;
            String rsult = msg;            
                for(int i = 1;i<=c;i++){
                    rsult+=":"+ran.nextInt();
                }
            return rsult;    
        };
        
    }
    
}
