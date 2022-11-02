/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch1_20221102;

/**
 *
 * @author xvpow
 */
public class Ch1_8 {

    public static void main(String[] args) {
       //短路 表示會中斷
       int i = 0;
       boolean a1 = true;
       boolean b1 = false;
       boolean an1 = a1 && ++i > 3;
       System.out.println(i);
       System.out.println(an1);
       
       i = 0;
       boolean an2 = b1 &&  ++i>3;
       System.out.println(an2);
       System.out.println(i);
       System.out.println("==================================");
       i = 0;
       boolean an3 = b1 || ++i <3;
       System.out.println(an3);
       System.out.println(i);
       i = 0;
       boolean an4 = a1 || ++i < 3;
       System.out.println(an4);
       System.out.println(i);
        
        
        
    }
    
}
