/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c11_20221125.ch11_6_abstract2;

/**
 *
 * @author xvpow
 */
//有抽象方法 類別一定是抽象的
//類別是抽象的 不一定有抽象方法
//抽象的類別不可final
//final 放在類別 表示不能被繼承
public abstract class Car  {
    private String company;
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }
    //方法上final表示不可複寫
    public abstract int getDoor();//抽象方法不可private 不可final
    public abstract String getEngine();//抽象方法不可private 不可final
    
    public String toString(){
        return this.getCompany()+":"+this.getDoor()+":"+this.getEngine();
    }
}
