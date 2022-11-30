/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch13_20221130.Ch13_1_Interface1;

/**
 *
 * @author xvpow
 */
public class Ch13_1 {

      static void testFly(Fly fly){
          fly.drive();
      }
    public static void main(String[] args) {
       AirPlan air = new AirPlan();
       testFly(air);
    }
    
}
