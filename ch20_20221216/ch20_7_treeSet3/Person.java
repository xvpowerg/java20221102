/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20221216.ch20_7_treeSet3;

/**
 *
 * @author xvpow
 */
public class Person {
    private String name;//3
    private int age;//1
    private int height;//2

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    
    
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", height=" + height + '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }
    
    
}
