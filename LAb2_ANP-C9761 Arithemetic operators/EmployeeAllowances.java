import java.util.Scanner;

public class EmployeeAllowances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();
        double da = basicSalary * 0.12;
        double hra = basicSalary * 0.13;
        double pf = basicSalary * 0.15;
        double grossSalary = basicSalary + da + hra - pf;
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("DA (12%): " + da);
        System.out.println("HRA (13%): " + hra);
        System.out.println("PF (15%): " + pf);
        System.out.println("Gross Salary: " + grossSalary);
        scanner.close();
    }
}
