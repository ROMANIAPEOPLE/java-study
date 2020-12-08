package Enum;

import java.util.function.Function;

public enum CalculatorJava7 {

    CAL_A{
        long calculate(long value) { return value;}
    },
    CAL_B {
        long calculate(long value) {return value*3;}
    },
    CAL_C {
        long calculate(long value) {return value*10;}
    },
    CAL_ETC {
        long calculate(long value) {return 0L;}
    };

    abstract long calculate(long value);
}
