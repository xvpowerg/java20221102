/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221128.Ch12_2_interface1;

/**
 *
 * @author xvpow
 */
public class Ch12_2 {

    /**
     * @param args the command line arguments
     */
    static void testFly(Fly fly){
        fly.flying();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AirPlane airPlane = new AirPlane();
        testFly(airPlane);
        Bird bird = new Bird();
        testFly(bird);
    }
    
}
