/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20221128.Ch12_1_abstract1.report;
import  ch12_20221128.Ch12_1_abstract1.erp.ErpReportAbs;
/**
 *
 * @author xvpow
 */
public class MyErpReport extends ErpReportAbs{
     protected   void reportStyle(String[] data){
         for (String d : data){
              String[] empInfos =  d.split(",");
              System.out.println("Name:"+empInfos[0]+" Score:"+empInfos[1]);             
         }
     }
}
