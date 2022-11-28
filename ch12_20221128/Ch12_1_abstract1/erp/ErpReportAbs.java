/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20221128.Ch12_1_abstract1.erp;

/**
 *
 * @author xvpow
 */
public abstract class ErpReportAbs {
    private String[] getData(){
        String[] data = {"Ken,80","Viivin,70","Lucy,25"};
        return data;
    }
    protected  abstract void reportStyle(String[] data);
    
    public final void exportReport(){
        reportStyle(getData());
    }
    
}
