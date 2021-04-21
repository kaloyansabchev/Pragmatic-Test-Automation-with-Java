package homework;

public class demo {
    public static void main(String[] args) {
        Person kaloyan = new Person("Kaloyan", 25, 160, 100);

        try {
            kaloyan.setAge(-20);
        } catch (NotPositiveAgeException ageException) {
            ageException.printStackTrace();
        }

        try {
            kaloyan.setHeight(-155);
        } catch (NotPositiveHeightException heightException) {
            heightException.printStackTrace();
        }

        try {
            kaloyan.setWeight(0);
        }catch (NotPositiveWeightException weightException){
            weightException.printStackTrace();
        }

    }
}
