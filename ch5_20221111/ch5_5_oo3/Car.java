/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch5_20221111.ch5_5_oo3;

/**
 *
 * @author xvpow
 */
public class Car {
    private String color;
    private String company;
    private int doors;
    //建構式
    Car(String inColor,String inCompany,int inDoors){
        color = inColor;
        company = inCompany;
        doors = inDoors;
    }
    
    public void setColor(String inColor){
        color = inColor;
    }
    public String getColor(){
        return color;
    }
    public void setCompany(String inCompany){
        company = inCompany;
    }
    public String getCompany(){
        return company;
    }
    public void setDoors(int inDoors){
        doors = inDoors;
    }
    
    public int getDoors(){
        return doors;
    }
    public void printInfo(){
        System.out.println(color+":"+company+":"+doors);
    }
}
