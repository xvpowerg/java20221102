/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch4_20221109;

public class Ch4_5 {
    
    static float test1(float f1,float f2){ 
        return f1 * f2;
    }
    
    static int test1(int v1,int v2){
        return v1 * v2;
    }
    
    static void testLoop(int s,int len,int step){
           for (int i = s; i<= len; i += step){
               System.out.print(i+" ");
           } 
            System.out.println();
    }
    //overloading 多載
    static void testLoop(int s,int len ){
        testLoop(s,len,1);//給預設值
    }
    
    static void test2(int v1,int v2){
        System.out.println(v1+":"+v2);
    }
    
    static void test2(int v1,int v2,int v3){
        System.out.println(v1+":"+v2+":"+v3);
    }
    
    public static void main(String[] args) {      
        float ans = test1(2.2f,3.1f);
        System.out.println(ans);
        int ans2 = test1(2,5);
        System.out.println(ans2);
        testLoop(5,10);
        testLoop(2,8,2);
        
        test2(10,2);
        test2(10,2,3);
    }
    
}
