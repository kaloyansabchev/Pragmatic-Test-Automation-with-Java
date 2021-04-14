import java.util.*;

public class TaskOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size/length for the collection(integer): ");
        int size = Integer.parseInt(sc.nextLine());
        while (size <= 0) {
            System.out.print("The number is invalid. Please enter a positive number that is greater than 0!\n");
            size = Integer.parseInt(sc.nextLine());
        }

        List<Integer> theArrayList = new ArrayList<>();

        for (int i = 1; i < size + 1; i++) {
            System.out.println("Please enter value for " + i + "-number: ");
            int n = Integer.parseInt(sc.nextLine());
            theArrayList.add(n);
        }
        System.out.println("The result collection is: " + theArrayList + "\n");

        Iterator<Integer> itr = theArrayList.iterator();
        int min = theArrayList.get(0);
        boolean hasNumberMultipleBy3 = false;

        while (itr.hasNext()) {
            int tmpInt = (int) itr.next();
            if (tmpInt % 3 == 0 && (min % 3 != 0 || tmpInt < min)) {
                hasNumberMultipleBy3 = true;
                min = tmpInt;
            }
        }

        if (!hasNumberMultipleBy3 && (min % 3 != 0)) {
            System.out.println("There are no number multiple by 3 in the collection.");
        } else {
            System.out.println("The least number that is a multiple of 3 is " + min);
        }
    }

}