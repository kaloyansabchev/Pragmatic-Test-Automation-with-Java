import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'A1':");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the 'A2':");
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the 'A3':");
        int num3 = Integer.parseInt(sc.nextLine());

        int reverse = num1;
        num1 = num2;
        num2 = num3;
        num3 = reverse;

        System.out.printf("The number 'A1'= %d%n", num1);
        System.out.printf("The number 'A2'= %d%n", num2);
        System.out.printf("The number 'A3'= %d", num3);

    }
}
