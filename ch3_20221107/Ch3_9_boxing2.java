/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch3_20221107;

/**
 *
 * @author xvpow
 */
public class Ch3_9_boxing2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //字串轉整數
        
        String sn = "24076";
        int intSn = Integer.parseInt(sn);
        System.out.println(intSn + 5);
        
//        String sn2 = "1 23";
//        int intSn2 = Integer.parseInt(sn2);
//        System.out.println(intSn2);

        String b1 = "tRuE";
        System.out.println(Boolean.parseBoolean(b1));
         b1 = "rrrrrr";
         System.out.println(Boolean.parseBoolean(b1));//只要不是true就回傳false
    }
    
}
