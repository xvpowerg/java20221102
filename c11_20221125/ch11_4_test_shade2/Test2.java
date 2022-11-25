/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c11_20221125.ch11_4_test_shade2;

/**
 *
 * @author xvpow
 */
public class Test2  extends Test1{

    // step 1 輸出 Msg3
//    public void setMsg(String msg){
//        this.msg = msg;
//    }

    
    // step 2 輸出 Test1
    //因為沒有複寫 printMsg所以找父類
//    String msg ="Test2";
//    public void setMsg(String msg){
//        this.msg = msg;
//    }

        // step 3 輸出 Msg3
      String msg ="Test2";
        public void setMsg(String msg){
            this.msg = msg;
        }
       public void printMsg(){
         System.out.println(msg);
       }
    
    
}
