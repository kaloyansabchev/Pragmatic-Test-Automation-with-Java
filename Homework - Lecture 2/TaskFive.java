import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the second number:");
        int num2 = Integer.parseInt(sc.nextLine());

        if (num1 > num2){
            for (int i = num2; i<= num1; i++ ){
                System.out.print(i + " ");
            }
        }else {
            for (int i = num1; i<= num2; i++ ){
                System.out.print(i + " ");
            }
        }
    }
}
