import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'A':");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the 'B':");
        int num2 = Integer.parseInt(sc.nextLine());

        int reverse = num2;
        num2 = num1;
        num1 = reverse;
        System.out.printf("The number 'A'= %d%n", num1);
        System.out.printf("The number 'B'= %d", num2);

    }
}
