import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the magic number:");
        int n = Integer.parseInt(sc.nextLine());

        int number = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(number);
            }
            System.out.println();
            number = number + 2;
        }
    }
}
