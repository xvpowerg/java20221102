/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20221226.Ch24_6_io1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author xvpow
 */
public class Ch24_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String path = "C:\\mydir\\msg.txt";
     String path2 = "C:\\mydir\\msg_copy.txt";
     File src = new File(path);    
     File target = new File(path2);   
     try{
         FileInputStream fin = new  FileInputStream(src);
         FileOutputStream fOut = new FileOutputStream(target);
         int data = -1;
         while( (data = fin.read()) != -1){
             fOut.write(data);
         }
     }catch(IOException ex){
         System.out.println(ex);
     }
     
     
     
    }
    
}
