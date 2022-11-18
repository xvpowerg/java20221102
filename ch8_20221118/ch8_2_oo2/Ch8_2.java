/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch8_20221118.ch8_2_oo2;

/**
 *
 * @author xvpow
 */
public class Ch8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MySQLConnection.connection();
        MySQLConnection.connection();
      MySQLConnection mconn =   MySQLConnection.connection();
      mconn.close();
       // MySQLConnection.connection();
        
    }
    
}
