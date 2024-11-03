import java.util.Scanner;

public class SquareCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        double perimeter = 4 * side;
        double area = side * side;
        System.out.println("Side length: " + side);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        scanner.close();
    }
}
