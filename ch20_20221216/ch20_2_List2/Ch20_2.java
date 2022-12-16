/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch20_20221216.ch20_2_List2;
import java.util.LinkedList;
/**
 *
 * @author xvpow
 */
public class Ch20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //新增 刪除  頭與中間的資料速度快
        //資料輪巡(foreach)慢
        LinkedList<String> list = new LinkedList();
     list.add("Ken");
     list.add("Vivin");
     list.add("Iris");
     list.add("Joy");
     list.forEach(v->System.out.println(v));
    }
    
}
