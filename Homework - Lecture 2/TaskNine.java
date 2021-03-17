import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter second number:");
        int num2 = Integer.parseInt(sc.nextLine());

        int sum = 0;
        for (int i = num1; i <=num2; i++){
            if (i % 3 !=0){
                System.out.print(i*i);
                sum += i*i;
            }else {
                System.out.print("skip " + i);
            }
            if(sum > 200)
                break;
            if(i != num2)
                System.out.print(", ");
        }

    }
}
