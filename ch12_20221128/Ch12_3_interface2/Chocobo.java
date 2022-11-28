/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20221128.Ch12_3_interface2;

/**
 *
 * @author xvpow
 */
public class Chocobo  implements Jump,Run{
        public void jumping(){
            System.out.println("Chocobo Jump~");
        }
        public void runing(){
            System.out.println("Chocobo Run~");
        }
}
