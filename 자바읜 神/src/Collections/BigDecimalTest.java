package Collections;

import java.math.BigDecimal;

//돈계산과같은 정확한 계산을 할때 사용하자.
public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest sample = new BigDecimalTest();
        sample.normalDoubleCalc();
        System.out.println("-------------");
        sample.bigDecimalCalc();
    }
    public void normalDoubleCalc(){
        double value = 1.0;
        for(int loop=0; loop<10; loop++){
            value+=0.1;
            System.out.println(value);
        }
    }
    public void bigDecimalCalc(){
        BigDecimal value = new BigDecimal("1.0");
        BigDecimal addValue = new BigDecimal(0.1);
        for(int i=0; i<10; i++){
           value= value.add(addValue);
            System.out.println(value.toString());
        }
    }



}
