package homework;

public class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NotPositiveAgeException {
        if (age <= 0) {
            throw new NotPositiveAgeException("The value you entered for age is incorrect.");
        } else {
            this.age = age;
            System.out.println("The value of the age is successfully changed to " + this.age);
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) throws NotPositiveHeightException {
        if (height <= 0) {
            throw new NotPositiveHeightException("The value you entered for height is incorrect.");
        } else {
            this.height = height;
            System.out.println("The value of the height is successfully changed to " + this.height);
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws NotPositiveWeightException {
        if (weight <= 0) {
            throw new NotPositiveWeightException("The value you entered for weight is incorrect.");
        } else {
            this.weight = weight;
            System.out.println("The value of the weight is successfully changed to " + this.weight);
        }
    }

}
