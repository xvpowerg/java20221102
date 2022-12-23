/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20221223.Ch23_2_option1;
import java.util.Optional;
/**
 *
 * @author xvpow
 */
public class Student {
    private String name;
    public Optional<String> getName() {
        Optional<String> nameOp = Optional.ofNullable(name);
        return nameOp;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
    }    
}
