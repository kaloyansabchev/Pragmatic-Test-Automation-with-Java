package inclass;

public class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer(2020, 2000, 1024, 500);

        Computer asus = new Computer(2021, 1000, false, 2048, 212, "Linux");

        Computer hp = new Computer();

        dell.changeOperationSystem("Mac OS");
        asus.useMemory(100);
        asus.useMemory(100);
        asus.useMemory(100);


        System.out.println(" ");
        System.out.println("Тhe year of production of the Dell is: " + dell.year);
        System.out.println("The Dell price is : " + dell.price);
        System.out.println("The Dell computer is notebook: " + dell.isNotebook);
        System.out.println("The Dell computer has " + dell.hardDiskMemory + "GB of memory.");
        System.out.println("The Dell computer has " + dell.freeMemory + "GB free space of memory");
        System.out.println("The Dell computer is using the operation system " + dell.operationSystem);
        System.out.println(" ");
        System.out.println("Тhe year of production of the Asus is: " + asus.year);
        System.out.println("The Asus price is: " + asus.price);
        System.out.println("The Asus computer is notebook: " + asus.isNotebook);
        System.out.println("The Asus computer has " + asus.hardDiskMemory + "GB of memory.");
        System.out.println("The Asus computer has " + asus.freeMemory + "GB free space of memory");
        System.out.println("The Asus computer is using the operation system " + asus.operationSystem);
        System.out.println(" ");
        System.out.println("Тhe year of production of the Asus is: " + hp.year);
        System.out.println("The Asus price is: " + hp.price);
        System.out.println("The Asus computer is notebook: " + asus.isNotebook);
        System.out.println("The Asus computer has " + hp.hardDiskMemory + "GB of memory.");
        System.out.println("The Asus computer has " + hp.freeMemory + "GB free space of memory");
        System.out.println("The Asus computer is using the operation system " + hp.operationSystem);
        System.out.println();

        int result = dell.comparePrice(asus);
        switch (result) {
            case -1:
                System.out.println("Dell is more expensive than Asus.");
                break;
            case 1:
                System.out.println("Dell is NOT more expensive than Asus.");
                break;
            case 0:
                System.out.println("The computers has equals prices.");
                break;
            default:
                System.out.println("Error !");
                break;

        }
    }
}
