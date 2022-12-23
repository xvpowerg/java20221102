/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch23_20221223.Ch23_3_option2;
import java.util.Optional;
import java.util.Random;
/**
 *
 * @author xvpow
 */
public class Ch23_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Optional<String> op1 = Optional.empty();
        //不可為null
        Optional<String> op2 = Optional.of("Ken");
       //可為null 
        Optional<String> op3 = Optional.ofNullable(null);
        
        Optional<String> tOp1 = Optional.ofNullable("Vivin"); 
        tOp1.ifPresent(st->System.out.println("ifPresent:"+st));
        tOp1.ifPresentOrElse(st->System.out.println("ifPresentOrElse:"+st),
                ()->System.out.println("ifPresentOrElse Empty"));
        if (tOp1.isEmpty()){
             System.out.println("tOp1 isEmpty ");
        }
        if(tOp1.isPresent()){
              System.out.println("tOp1 isPresent ");
        }
        
         Optional<String> tOp2 = Optional.ofNullable(null); 
         //tOp2 內容不是null回傳內容 如果是null回傳 orElse內的參數
        String msg = tOp2.orElse("Default");
        System.out.println(msg);
        //    //tOp2 內容不是null回傳內容 如果是null回傳orElseGet內的回傳值
        String msg2 =tOp2.orElseGet(()->{
          Random ran= new Random();
          return (char)(ran.nextInt(26)+'A') +"";
        });
          System.out.println(msg2);
          //tOp2 內容不是null回傳內容 如果是null回傳 拋出例外
         //tOp2.orElseThrow();
           //tOp2 內容不是null回傳內容 如果是null回傳 拋出自訂的例外
          tOp2.orElseThrow(IllegalArgumentException::new);
    }
    
}
