import java.util.*;

public class TaskTwo {
    private static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int n = Integer.parseInt(sc.nextLine());

        List<Integer> theArrayList = new ArrayList<>();
        theArrayList.add(n);
        theArrayList.add(n);

        for (int i = 2; i < ARRAY_LENGTH; i++) {
            theArrayList.add(i, (int) theArrayList.get(i - 1) + (int) theArrayList.get(i - 2));
        }

        System.out.println("You entered the number [" + n + "] and the results is: " + theArrayList);
    }
}
