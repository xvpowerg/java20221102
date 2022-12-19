/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch21_20221219.Ch21_1_TreeSet1;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    private int score1;
    private int score2;
    private int score3;

    public Student(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    public String getName() {
        return name;
    }

    public int getScore1() {
        return score1;
    }

    public int getScore2() {
        return score2;
    }

    public int getScore3() {
        return score3;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", score1=" + score1 + ", score2=" + score2 + ", score3=" + score3 + '}';
    }
    
    
}
