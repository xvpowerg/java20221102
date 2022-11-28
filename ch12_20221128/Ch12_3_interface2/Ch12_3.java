/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221128.Ch12_3_interface2;

/**
 *
 * @author xvpow
 */
public class Ch12_3 {

    static void testRun(Run run){
        run.runing();
    }
    static void testJump(Jump jump){
        jump.jumping();        
    }
    
    static void testChocoboSkillGroup(ChocoboSkillGroup group){
        group.runing();
        group.jumping();
        System.out.println(ChocoboSkillGroup.MAX_HEIGHT);
        System.out.println(ChocoboSkillGroup.SPEED);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Chocobo c1 = new Chocobo();
        testRun(c1);
        testJump(c1);
        System.out.println("====================");
        Chocobo2 c2 = new Chocobo2();
        testChocoboSkillGroup(c2);
    }
    
}
