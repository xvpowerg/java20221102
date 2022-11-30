/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch13_20221130.Ch13_2_Interface2;

/**
 *
 * @author xvpow
 */
public class MyList implements MyIterator<String>{
    private int size = 0;
    private int len = 500;
    private int index  = -1;
    private String[] array = new String[len];
    
    public void add(String v){
        if (size < len){
            array[size++] = v;
        }
    }    
    public String get(int index){
        if (index< 0 || index >= size){
            throw new IndexOutOfBoundsException("Index Error:"+index);
        }
        return array[index];
    }
    public int getSize(){
        return this.size;
    }
    
    public String next(){
       
        return array[++index];
    }
    public boolean hasNext(){
        if (size > 0 && index < size - 1){
            return true;
        }else{
             index = -1;
             return false;
        }
       
    }
    
}
