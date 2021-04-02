public class Person {
    String name;
    int age;
    boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
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

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    public void showPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (isMan) {
            System.out.println("Person is male");
        } else {
            System.out.println("Person is female");
        }
    }
}
