package inclass;

public class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer();
        dell.year = 2020;
        dell.price = 2000.21;
        dell.isNotebook = true;
        dell.hardDiskMemory = 1024;
        dell.freeMemory = 500;
        dell.operationSystem = "Windows";

        Computer asus = new Computer();
        asus.year = 2021;
        asus.price = 1000.21;
        asus.isNotebook = false;
        asus.hardDiskMemory = 2048;
        asus.freeMemory = 212;
        asus.operationSystem = "Linux";

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
    }
}
