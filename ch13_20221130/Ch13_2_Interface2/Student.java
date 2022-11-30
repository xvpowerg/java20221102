/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20221130.Ch13_2_Interface2;

/**
 *
 * @author xvpow
 */
public class Student implements MyIterator<String> {
    private String[] scores = new String[4]; 
    private int len = 4;
    private int size = 0;
    private int index = -1;
    public void addScroe(String s){
        scores[size++] = s;
    }
    public String getScore(int index ){
        return scores[index];
    }
    
    public boolean hasNext(){
         if (size > 0 && index < size-1){
             return true;
         }   
        return false;
    }
    
    public String next(){
        return scores[++index];
    }
}
