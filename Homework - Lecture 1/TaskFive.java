import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1 = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the second number:");
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the third number:");
        double num3 = Double.parseDouble(sc.nextLine());

        if (num1 > num2 && num1 > num3){
            if (num2 > num3){
                System.out.println("The order of the numbers in descending order is:");
                System.out.println(num1 + ", " + num2 + ", " + num3);
            }else {
                System.out.println("The order of the numbers in descending order is:");
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 > num1 && num2 > num3){
            if (num1 > num3){
                System.out.println("The order of the numbers in descending order is:");
                System.out.println(num2 + ", " + num1 + ", " + num3);
            }else {
                System.out.println("The order of the numbers in descending order is:");
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else if (num3 > num1 && num3 > num2){
            if (num2 > num1){
                System.out.println("The order of the numbers in descending order is:");
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }else {
                System.out.println("The order of the numbers in descending order is:");
                System.out.println(num3 + ", " + num1 + ", " + num2);
            }
        }

    }
}
