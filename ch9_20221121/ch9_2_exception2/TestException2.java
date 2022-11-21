/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch9_20221121.ch9_2_exception2;
import java.io.IOException;//父
import java.io.FileNotFoundException;//子
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class TestException2 {
    public void testIOException(boolean b1)throws IOException{
        if (b1){
            throw new IOException("testIOException");
        }
    }
    
      public void testFileNotFoundException(boolean b1)throws FileNotFoundException{
        if (b1){
            throw new FileNotFoundException("testFileNotFoundException");
        }
    }
      
      public void testSQLException(boolean b1)throws SQLException{
          if (b1){
              throw new SQLException("testSQLException");
          }
      }
}
