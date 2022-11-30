package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double result;
        if (salary >= 0 && salary <= 10000) {
            result = salary - salary * 15.0 / 100;
            System.out.println(result);
        }
        if (salary > 10000 && salary <= 20000) {
            result = salary - salary * 18.0 / 100;
            System.out.println(result);
        }
        if (salary > 20000) {
            result = salary - salary * 20.0 / 100;
            System.out.println(result);
        }
        if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
