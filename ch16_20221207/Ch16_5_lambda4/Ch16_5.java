/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20221207.Ch16_5_lambda4;
import java.util.Random;
public class Ch16_5 {

    static void testLambda3(int count,TestLambda3 tb3){
        String v = tb3.testLambda(count);
        System.out.println("Result:"+v);
    }
    public static void main(String[] args) {
       
        testLambda3(3,(int c)->{
            Random ran = new Random();
           String[] value = {"A","B","C","D"};
           String result = "";
            for(int i = 1;i<=3;i++){
                result += value[ran.nextInt(value.length)];
            }
            return result; 
        });
     
        testLambda3(5,i->(char)('A'+i)+"");
         testLambda3(5,i->{
             return (char)('A'+i)+"";
         });
        
    }    
}
