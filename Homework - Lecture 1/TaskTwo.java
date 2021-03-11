import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 'A':");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Enter number 'B':");
        double b = Double.parseDouble(sc.nextLine());

        double sum = a + b;
        double diff = a - b;
        double multiplication = a * b;
        double divisionA = a / b;
        double divisionB = b / a;
        double division2A = a % b;
        double division2B = b % a;

        System.out.printf("The sum of 'A' and 'B' is: %.2f%n", sum);
        System.out.printf("The difference of 'A' and 'B' is: %.2f%n", Math.abs(diff));
        System.out.printf("The multiplication of 'A' and 'B' is: %.2f%n", multiplication);
        System.out.printf("The division of 'А' with 'B' is: %.2f%n",divisionA);
        System.out.printf("The division of 'B' with 'A' is: %.2f%n",divisionB);
        System.out.printf("The division with remainder of 'A' with 'B' is: %.2f%n", division2A);
        System.out.printf("The division with remainder of 'B' with 'A' is: %.2f", division2B);

    }
}
