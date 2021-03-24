package inclass;

public class StudentDemo {

    public static void main(String[] args) {

        Student kaloyan = new Student("Kaloyan Sabchev", "math", 25);
        Student ivan = new Student("Ivan Ivanov", "math", 29);

        for (int i = 1; i <= 4; i++) {
            kaloyan.upYear();
            if (kaloyan.isDegree) {
                System.out.println(kaloyan.name + " is " + kaloyan.age + " years old and has " + kaloyan.yearInCollage + " years in collage.");
                double result = kaloyan.receiveScholarship(3, 50);
                System.out.println(kaloyan.name + " got " + kaloyan.money + "$ in total from scholarships.");
                kaloyan.upYear();
                break;
            }
            System.out.println(kaloyan.name + " is " + kaloyan.age + " years old and has " + kaloyan.yearInCollage + " years in collage.");
            double result = kaloyan.receiveScholarship(3, 50);
            System.out.println(kaloyan.name + " got " + kaloyan.money + "$ in total from scholarships.");
            kaloyan.age++;
        }
        System.out.println(" ");
        for (int i = 1; i <= 4; i++) {
            ivan.upYear();
            if (ivan.isDegree) {
                System.out.println(ivan.name + " is " + ivan.age + " years old and has " + ivan.yearInCollage + " years in collage.");
                double result = ivan.receiveScholarship(3, 50);
                System.out.println(ivan.name + " got " + ivan.money + "$ in total from scholarships.");
                ivan.upYear();
                break;
            }
            System.out.println(ivan.name + " is " + ivan.age + " years old and has " + ivan.yearInCollage + " years in collage.");
            double result = ivan.receiveScholarship(3, 50);
            System.out.println(ivan.name + " got " + ivan.money + "$ in total from scholarships.");
            ivan.age++;


        }
    }
}

