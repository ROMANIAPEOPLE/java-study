package example.c.tryCatchTest;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
            calc.printDivide(1,2);
            calc.printDivide(1,0);

    }

    private void printDivide(double d1, double d2) throws Exception {
        try{
            if(d2==0) {
                throw new Exception("Second value can't be Zero");
            }
            double result = d1/d2;
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
