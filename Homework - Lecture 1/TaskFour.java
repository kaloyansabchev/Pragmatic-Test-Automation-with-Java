import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the second number:");
        double num2 = Double.parseDouble(sc.nextLine());

        if (num1 > num2){
            System.out.println(num2 +", " + num1);
        }else {
            System.out.println(num1 +", " + num2);
        }
    }
}
