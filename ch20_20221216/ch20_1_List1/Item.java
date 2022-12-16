/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch20_20221216.ch20_1_List1;

/**
 *
 * @author xvpow
 */
public class Item {
    private int id;
    private String name;
    
    public Item(int id,String name){
        this.id = id;
        this.name = name;
    }
    
    public String toString(){
        return id+":"+name;
    }
    
    public boolean equals(Object obj){
       Item tmp = (Item)obj;
        
       return this.id == tmp.id && this.name.equals(tmp.name);
    }
    
    
}
