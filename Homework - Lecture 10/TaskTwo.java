import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskTwo {
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(n);
        arrayList.add(n);

        for (int i = 2; i < ARRAY_LENGTH; i++) {
            arrayList.add(i, (int) arrayList.get(i - 1) + (int) arrayList.get(i - 2));
        }

        System.out.println("You entered the number [" + n + "] and the results is: " + arrayList);
    }
}
