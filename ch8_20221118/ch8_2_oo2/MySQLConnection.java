/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch8_20221118.ch8_2_oo2;

/**
 *
 * @author xvpow
 */
public class MySQLConnection {
    private static int count = 0;
    private MySQLConnection(){        }
    
    public static  MySQLConnection connection(){
        if (count == 3){
            System.out.println("已額滿");
        }
        count++;
        return new MySQLConnection();
    }
    
    public void close(){
        count--;
    }
    
    
}
