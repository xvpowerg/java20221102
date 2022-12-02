package ch14_20221202.Ch14_5_func_interface5;
import java.util.function.UnaryOperator;
class Incremental implements UnaryOperator<Integer>{
    private int offset = 0;
    Incremental(int offset){
        this.offset = offset;
    }
    public Integer apply(Integer v){
        return v + offset;
    }
}
public class Ch14_5 {

    static int[] accumulate(int[] values,UnaryOperator<Integer> operator){
        for(int i = 0; i < values.length;i++){
            values[i] = operator.apply(values[i]);
        }
        return values;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int[] values = {1,2,3,4,5};
        Incremental inc = new Incremental(2);
        int[] result = accumulate(values, inc);
        for (int v : result){
            System.out.print(v+" ");
        }
        System.out.println();
  
        
    }
    
}
