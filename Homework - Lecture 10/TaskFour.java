import java.util.*;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size/length for the collection(integer): ");
        int size = Integer.parseInt(sc.nextLine());
        while (size <= 0) {
            System.out.print("The number is invalid. Please enter a positive number that is greater than 0!\n");
            size = Integer.parseInt(sc.nextLine());
        }

        List<Double> theArrayList = new ArrayList<Double>();

        for (int i = 0; i < size + 1; i++) {
            theArrayList.add(i * 3.0);
        }
        System.out.println("The collection is looking like: " + theArrayList);
    }

}

