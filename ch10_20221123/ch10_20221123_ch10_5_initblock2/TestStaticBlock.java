/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221123_ch10_5_initblock2;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class TestStaticBlock {    
    private static ArrayList<String> list = new ArrayList();
    private static Random ran;
    static{
        init();
    }
    private static void  init(){
        for (char c = 'A'; c<= 'Z';c++){
            list.add(c+"");    
        }        
         ran = new Random();
    }
    
    public static String getString(){
        //0~25
        String msg = "";
            for (int i = 0;i< ran.nextInt(list.size());i++){
                msg +=  list.get(i);
            }
        return msg;
    }
    
}
