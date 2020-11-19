package example;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager s = new SalaryManager();
        double value =s.getMonthlySalary(20000000);
        System.out.println(value);
    }
    public double getMonthlySalary(int yearSalary) {

        double monthlySalary = yearSalary/12;

        double tax = calculateTax(monthlySalary);
        double pension = calculateNationalPension(monthlySalary);
        double insurance = calculateHealthInsurance(monthlySalary);

        double totalTax = tax+pension+insurance;

        monthlySalary=monthlySalary-totalTax;
        return monthlySalary;
    }

    public double calculateTax(double monthSalary) {
        return monthSalary*0.125;
    }
    public double calculateNationalPension(double monthSalary) {
        return monthSalary*0.081;
    }
    public double calculateHealthInsurance(double monthSalary) {
        return monthSalary*0.135;
    }





}
