/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch10_20221123_ch10_4_initblock1;


public class TestBlock {
    //當有一件事每個建構式都需要初始化的程式
    //很適合使用初始化區塊完成
    private int id;
    private String[] names = new String[50];
    {

        for (int i = 0;i<names.length;i++){
            names[i] = "";
        }
    }

    public TestBlock(){
     
    }
    
    public TestBlock(int id){
        //this();
        this.id = id;
    }
    
    
    public boolean find(String name){
        for (String n : names){
            if (n.equals(name)){
                return true;
            }
        }
        return false;
    }
}
