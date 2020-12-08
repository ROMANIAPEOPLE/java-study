package Enum;

public class EnumTest {
    public static void main(String[] args) {

        Calculator type  = selectType();
        long originValue = 100L;
        long result = type.calculate(originValue);
        System.out.println(result);

    }

    private static Calculator selectType() {
        return Calculator.CALC_C;
    }
}
