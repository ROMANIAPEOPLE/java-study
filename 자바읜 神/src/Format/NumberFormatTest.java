package Format;

import java.text.NumberFormat;

public class NumberFormatTest {
    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getInstance();
        String str = formatter.format(3.1415927);
        System.out.println(str);
    }
}
