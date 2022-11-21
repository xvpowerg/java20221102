/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20221121.ch9_2_exception2;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
public class Ch9_2 {

    public static void main(String[] args) {
        
        // TODO code application logic here
        TestException2 te2 = new TestException2();
//        try{
//            //越下越父
//            te2.testIOException(false);
//            te2.testFileNotFoundException(false);
//            te2.testSQLException(true);
//        }catch(FileNotFoundException ex){
//            System.out.println(ex);
//        }catch(IOException ex){
//            System.out.println(ex);
//        }catch(SQLException ex){
//            System.out.println(ex);     
//        }


        try{
            //越下越父
            te2.testIOException(false);
            te2.testFileNotFoundException(false);
            te2.testSQLException(true);
        }catch(FileNotFoundException | SQLException ex){
            System.out.println(ex);
        }catch(IOException ex){
            System.out.println(ex);
        }finally{
            System.out.println("Close");   
        }
        
        try{
            System.out.println("Test Try");   
        }finally{
             System.out.println("Close2");   
        }
        
    }
    
}
