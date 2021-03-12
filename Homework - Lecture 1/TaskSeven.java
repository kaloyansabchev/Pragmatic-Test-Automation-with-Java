import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter what time is it?");
        int time = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the available money:");
        double money = Double.parseDouble(sc.nextLine());

        System.out.println("If you are sick type 'false' or if you are healthy type 'true'?");
        boolean isSick = Boolean.parseBoolean(sc.nextLine());

        if(!isSick){
            System.out.println("I'm sick, ok let me see how much money i got.");
            if (money > 10){
                System.out.println("Ok i have enough i will go out and buy medicine.");
                if (time > 20){
                    System.out.println("It's too late all pharmacies have closed!");
                }
            } else {
                System.out.println("I don't have enough money for medicine. I will stay at home and drink a tea");
            }
        } else {
            System.out.println("I'm not sick, i can do something.");
            if (money > 10){
                System.out.println("I will go to the cafe.");
            }
            if (time > 22){
                System.out.println("It's too late, everything can be closed");
            }
        }

    }
}
