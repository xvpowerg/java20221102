/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch12_20221128.Ch12_1_abstract1.report;
import ch12_20221128.Ch12_1_abstract1.erp.ErpReportAbs;
/**
 *
 * @author xvpow
 */
public class MyErpReport2 extends ErpReportAbs{
      protected   void reportStyle(String[] data){
          for (String v : data){
              String[] empInfo =   v.split(",");
              System.out.println("Name:"+empInfo[0]);
              System.out.println("Score:"+empInfo[1]);
              System.out.println("=========================");
          }
      }
}
