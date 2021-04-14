import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size/length for the collection(integer): ");
        int size = Integer.parseInt(sc.nextLine());
        while (size <= 0) {
            System.out.print("The number is invalid. Please enter a positive number that is greater than 0!\n");
            size = Integer.parseInt(sc.nextLine());
        }
        System.out.println("You selected " + size + " for your collection length.");
        List<Integer> theArrayList = new ArrayList<>();

        for (int i = 1; i < size + 1; i++) {
            System.out.print("Please enter value for " + i + "-number: ");
            theArrayList.add(sc.nextInt());
        }
        boolean isMirrored = true;
        for (int i = 0; i < size / 2; i++) {
            if (!theArrayList.get(i).equals(theArrayList.get(size - 1 - i))) {
                isMirrored = false;
                break;
            }
        }
        if (size == 1) {
            System.out.println("You entered only one digit as a length, so there is no point for comparison, the collection you entered is always Mirrored!");
        } else {
            if (isMirrored) {
                System.out.println("The collection you entered is Mirrored.");
            } else {
                System.out.println("The collection you entered is NOT Mirrored.");
            }
        }

    }
}



