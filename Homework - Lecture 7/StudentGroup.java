public class StudentGroup {
    private String groupSubject;
    private Student[] students;
    private int freePlaces;
    private static final double SCHORLARSHIP_AMOUNT = 50;

    public StudentGroup() {
        this.students = new Student[5];
        freePlaces = 5;
    }

    public StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    public void addStudent(Student s) {
        if (!s.getSubject().equals(this.groupSubject)) {
            System.out.println("We can not add student " + s.getName() + " in group " + groupSubject + ", he/she has different subject!\r");
            return;
        }
        if (freePlaces == 0) {
            System.out.println("Sorry we can't add student " + s.getName() + ", there is not more free places in the " + groupSubject + " group.\r");
            return;
        }

        students[students.length - freePlaces] = s;
        freePlaces--;
    }


    public void emptyGroup() {
        freePlaces = 5;
        students = new Student[5];
    }

    public String findBestStudent() {
        Student bestStudent = students[0];

        for (int i = 1; i < students.length - freePlaces; i++) {
            if (students[i].getGrade() >= bestStudent.getGrade()) {
                bestStudent = students[i];
            }
        }
        System.out.println("The best student in group " + groupSubject + " is " + bestStudent.getName() + "!");
        bestStudent.receiveScholarship(4, SCHORLARSHIP_AMOUNT);
        System.out.println(bestStudent.getName() + " got " + bestStudent.getMoney() + "$ scholarship/s.");

        return bestStudent.getName();
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void printStudentsInGroup() {
        System.out.println("The students in group " + "\"" + groupSubject + "\"" + " are:");
        for (int i = 0; i < students.length - freePlaces; i++) {
            System.out.println("Name: " + students[i].getName() + ", age: " + students[i].getAge() + ", grade: " + students[i].getGrade() +
                    ", " + students[i].getYearInCollage() + " year/s in college.");
        }
    }

}
