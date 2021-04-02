public class Demo {
    private static final int ARRAY_LENGTH = 10;
    private static final double OVERTIME_HOURS_WORKED = 2;
    public static void main(String[] args) {
        Person[] people = new Person[ARRAY_LENGTH];

        Person kaloyan = new Person("Kaloyan", 26, true);
        Person ivan = new Person("Ivan", 30, true);

        Student joe = new Student("Joe", 16, true, 5.5);
        Student maria = new Student("Maria", 27, false, 5.98);

        Employee koce = new Employee("Kostadin", 28, true, 100.5);
        Employee pesho = new Employee("Petar", 17, true, 152.8);

        people[0] = kaloyan;
        people[1] = ivan;
        people[2] = joe;
        people[3] = maria;
        people[4] = koce;
        people[5] = pesho;

        for(Person p : people) {
            if(p != null) {
                System.out.println("");
                if (p instanceof Student) {
                    ((Student) p).showStudentInfo();
                    continue;
                }
                if (p instanceof Employee) {
                    ((Employee) p).showEmployeeInfo();
                    continue;
                }
                if (p instanceof Person) {
                    p.showPersonInfo();
                }
            }
        }

        System.out.println("---------Overtime---------");

        for(Person p : people) {
            if(p != null && p instanceof Employee) {
                double overtime = ((Employee) p).calculateOvertime(OVERTIME_HOURS_WORKED);
                System.out.println(p.getName() + "'s overtime is " + overtime + "\n");
            }
        }

    }
}
