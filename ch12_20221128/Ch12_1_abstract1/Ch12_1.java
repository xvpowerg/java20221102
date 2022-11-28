/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch12_20221128.Ch12_1_abstract1;
 import ch12_20221128.Ch12_1_abstract1.erp.ErpReportAbs;
import ch12_20221128.Ch12_1_abstract1.report.MyErpReport;
import ch12_20221128.Ch12_1_abstract1.report.MyErpReport2;
/**
 *
 * @author xvpow
 */
public class Ch12_1 {

        
    
    public static void testReport(ErpReportAbs erpReport){
        erpReport.exportReport();
    }
    
    public static void main(String[] args) {
//       MyErpReport myErpReport = new MyErpReport();
//        testReport(myErpReport);
//        System.out.println("=========================");
//      MyErpReport2 myErpReport2 = new MyErpReport2();
//       testReport(myErpReport2);
    int type = 1;
    ErpReportAbs erpReport = null;
    switch(type){
        case 1:
            erpReport = new MyErpReport(); 
            break;
        case 2:
            erpReport = new MyErpReport2(); 
            break;
    }
       testReport(erpReport);
       
       
    }
    
}
