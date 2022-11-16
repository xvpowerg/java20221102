/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch7_20221116.ch7_4_oo4;

/**
 *
 * @author xvpow
 */
public class TestModifier {
    public String publicValue = "publicValue";//跨package可讀寫
    protected String protectedValue = "protectedValue";//相同package與跨package但須繼承才可讀寫
    //default
    String defaultValue = "defaultValue";//相同package才可讀寫
    private String privateValue = "privateValue";//只在自己類別中執行
}
