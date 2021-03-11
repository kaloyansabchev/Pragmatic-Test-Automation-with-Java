import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 'A':");
        double a = Double.parseDouble(sc.nextLine());

        System.out.println("Enter number 'B':");
        double b = Double.parseDouble(sc.nextLine());

        System.out.println("Enter number 'C':");
        double c = Double.parseDouble(sc.nextLine());

        if (a > b){
            if (b < c && c < a){
                System.out.println("Number 'C' is between the numbers 'A' and 'B'");
            }else {
                System.out.println("Number 'C' is not between the numbers 'A' and 'B'");
            }
        }else {
            if (a < c && c < b){
                System.out.println("Number 'C' is between the numbers 'A' and 'B'");
            }else {
                System.out.println("Number 'C' is not between the numbers 'A' and 'B'");
            }

        }


    }
}
