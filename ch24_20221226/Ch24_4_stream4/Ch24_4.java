/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch24_20221226.Ch24_4_stream4;
import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 *
 * @author xvpow
 */
public class Ch24_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
              ArrayList<String> list = new ArrayList<>();
                list.add("Ken");
                list.add("ViVin");
                list.add("Lucy");
                list.add("Joy");
                list.add("Iris");
             String join = list.stream().collect(Collectors.joining(",","Name:","."));
             System.out.println(join);
    }
    
}
