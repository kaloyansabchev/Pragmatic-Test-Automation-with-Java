public class Student {
    private String name;
    private String subject;
    private double grade;
    private int yearInCollage;
    private int age;
    private boolean isDegree;
    private double money;

    public Student() {
        grade = 4.0;
        yearInCollage = 1;
        isDegree = false;
        money = 0;
    }

    public Student(String name, String subject, int age, int grade) {
        this();
        setGrade(grade);
        this.name = name;
        setSubject(subject);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade > 0 && grade <= 6) {
            this.grade = grade;
        } else {
            System.out.println("The entered value for the grade is incorrect!\n");
        }
    }

    public int getYearInCollage() {
        return yearInCollage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Negative value for age is not allowed!\n");
        }
    }

    public double getMoney() {
        return money;
    }

    public void upYear() {
        if (grade >= 4) {
            if (isDegree) {
                System.out.println("The student got a degree!");
                return;
            }
            yearInCollage++;
            if (yearInCollage == 4) {
                isDegree = true;
            }
            age++;
        }
    }


    public double receiveScholarship(double min, double amount) {
        if (grade >= min && age < 30) {
            money += amount;
        }
        return money;
    }
}
