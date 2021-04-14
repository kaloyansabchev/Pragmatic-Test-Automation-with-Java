import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter size/length for the ArrayList(integer): ");
            int size = Integer.parseInt(sc.nextLine());
            if (size <= 0) {
                System.out.println("Please enter a positive number that is greater than 0!");
                
            } else {
                List<Integer> arrayList = new ArrayList<>();

                for (int i = 1; i < size + 1; i++) {
                    System.out.print("Please enter value for " + i + "-number: ");
                    arrayList.add(sc.nextInt());
                }
                boolean isMirrored = true;
                for (int i = 0; i < size / 2; i++) {
                    if (!arrayList.get(i).equals(arrayList.get(size - 1 - i))) {
                        isMirrored = false;
                        break;
                    }
                }
                if (size == 1) {
                    System.out.println("You entered only one digit as a length, so there is no point for comparison!");
                    break;
                } else {
                    if (isMirrored) {
                        System.out.println("The array you entered is Mirrored.");
                        break;
                    } else {
                        System.out.println("The array you entered is NOT Mirrored.");
                        break;
                    }
                }
            }


        }
    }
}
