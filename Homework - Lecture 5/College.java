public class College {
    public static void main(String[] args) {
        Student kaloyan = new Student("Kaloyan", "Math", 25, 5);
        Student ivan = new Student("Ivan", "Math", 35, 4);
        Student maria = new Student("Maria", "Math", 29, 3);
        Student milen = new Student("Milen", "Informatics", 23, 6);
        Student milena = new Student("Milena", "Math", 43, 4);
        Student alex = new Student("Alexander", "Math", 23, 4);
        Student stefan = new Student("Stefan", "Math", 23, 2);
        Student kal = new Student("Kaloyan", "Informatics", 25, 5);

        StudentGroup maths = new StudentGroup("Math");
        maths.addStudent(kaloyan);
        maths.addStudent(ivan);
        maths.addStudent(maria);
        maths.addStudent(milen);
        maths.addStudent(milena);
        maths.addStudent(alex);
        maths.addStudent(stefan);

        StudentGroup informatics = new StudentGroup("Informatics");
        informatics.addStudent(kaloyan);
        informatics.addStudent(milen);
        informatics.addStudent(kal);

        kaloyan.upYear();
        ivan.upYear();
        maria.upYear();
        System.out.println();
        informatics.printStudentsInGroup();
        System.out.println();
        maths.printStudentsInGroup();
        System.out.println();
        String mathsBestStudent = maths.findBestStudent();
        String informaticsBestStudent = informatics.findBestStudent();

        maths.emptyGroup();
        informatics.emptyGroup();

        System.out.println();
        System.out.println("The free places for the next year \"Math\" group are " + maths.freePlaces + ".");
        System.out.println("The free places for the next year \"Informatics\" group are " + informatics.freePlaces + ".");


    }

}
