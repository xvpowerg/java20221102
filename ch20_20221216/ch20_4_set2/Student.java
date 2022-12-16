/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20221216.ch20_4_set2;

/**
 *
 * @author xvpow
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + '}';
    }
    
    public boolean equals(Object obj){
        Student tmp = (Student)obj;
        return this.name.equals(tmp.name);
    }
    
    //equals 一樣 hashCode必須一樣 
    //hashCode一樣  equals 不一定相同
    
    public int hashCode(){
        return this.name.hashCode();
    }
}
