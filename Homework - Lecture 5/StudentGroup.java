import org.jetbrains.annotations.NotNull;

public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup() {
        this.students = new Student[5];
        freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    void addStudent(@NotNull Student s) {
        if (!s.subject.equals(this.groupSubject)) {
            System.out.println("We can not add student " + s.name + " in group " + groupSubject + ", he/she has different subject!\r");
            return;
        }
        if (freePlaces == 0) {
            System.out.println("Sorry we can't add student " + s.name + ", there is not more free places in the " + groupSubject + " group.\r");
            return;
        }

        students[students.length - freePlaces] = s;
        freePlaces--;
    }

    void emptyGroup() {
        freePlaces = 5;
        students = new Student[5];
    }

    String findBestStudent() {
        Student bestStudent = students[0];

        for (int i = 1; i < students.length - freePlaces; i++) {
            if (students[i].grade >= bestStudent.grade) {
                bestStudent = students[i];
            }
        }
        System.out.println("The best student in group " + groupSubject + " is " + bestStudent.name + "!");
        bestStudent.receiveScholarship(4, 50);
        System.out.println(bestStudent.name + " got " + bestStudent.money + "$ scholarships.");

        return bestStudent.name;
    }

    void printStudentsInGroup() {
        System.out.println("The students in group " + "\"" + groupSubject + "\"" + " are:");
        for (int i = 0; i < students.length - freePlaces; i++) {
            System.out.println("Name: " + students[i].name + ", age: " + students[i].age + ", grade: " + students[i].grade +
                    ", " + students[i].yearInCollage + " year/s in college.");
        }
    }

}
