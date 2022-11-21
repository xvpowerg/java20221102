/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20221121.ch9_3_exception3;

/**
 *
 * @author xvpow
 */
public class Ch9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestMyException tmye = new TestMyException();
//        try{
//            tmye.testAgeException(false,"AgeException");
//            //tmye.testNameException(true,"");

//        }catch(AgeException ex){
//            System.out.println(ex);
//        }catch(NameException ex){
//        System.out.println("NameException:"+ex);
//        }catch(Exception ex){
//            System.out.println("Exception:"+ex);
//        }

     try{
            tmye.testAgeException(false,"Age Error");
            tmye.testNameException(true,"Name Error");
           // tmye.testNameException(true);
        }catch(AgeException ex){
            System.out.println(ex);
        }catch(NameException ex){
             System.out.println("NameException:"+ex);
        }catch(Exception ex){
            System.out.println("Exception:"+ex);
        }
        
    }
    
}
