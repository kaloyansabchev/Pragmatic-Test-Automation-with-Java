package homework;

import java.util.*;

public class TaskOne {
    private static final int NUMBERS_IN_LIST = 6;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> arrayListOfNumbers = new ArrayList<>();

        for (int i = 1; i < NUMBERS_IN_LIST; i++) {
            System.out.println("Please enter the " + i + " ");
            int n = Integer.parseInt(sc.nextLine());
            arrayListOfNumbers.add(n);
        }
        System.out.println("The result ArrayList is: " + arrayListOfNumbers + "\n");

        Iterator itr = arrayListOfNumbers.iterator();
        int min = arrayListOfNumbers.get(0);
        boolean hasNumberMultipleBy3 = false;

        while(itr.hasNext()) {
            int tmpInt = (int)itr.next();
            if(tmpInt % 3 == 0 && (min % 3 != 0 || tmpInt < min)){
                hasNumberMultipleBy3 = true;
                min = tmpInt;
            }
        }

        if(!hasNumberMultipleBy3 && (min % 3 != 0)) {
            System.out.println("There are no number multiple by 3 in the ArrayList.");
        } else {
            System.out.println("The minimum number multiple by 3 is " + min);
        }
    }

}