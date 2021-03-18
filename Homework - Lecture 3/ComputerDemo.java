package inclass;

public class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer();
        dell.year = 2020;
        dell.price = 2000.21;
        dell.isNotebook = true;
        dell.hardDiskMemory = 1024;
        dell.freeMemory = 200;
        dell.operationSystem = "Windows";

        Computer asus = new Computer();
        asus.year = 2021;
        asus.price = 1000.21;
        asus.isNotebook = false;
        asus.hardDiskMemory = 2048;
        asus.freeMemory = 512;
        asus.operationSystem = "Linux";

        dell.changeOperationSystem("Mac OS");
        asus.useMemory(100);

        System.out.println("Тhe year of production of the Dell is: " + dell.year);
        System.out.println("The dell price is : " + dell.price);
        System.out.println(dell.isNotebook);
        System.out.println(dell.hardDiskMemory);
        System.out.println(dell.freeMemory);
        System.out.println(dell.operationSystem);

        System.out.println("Тhe year of production of the Asus is: " + asus.year);
        System.out.println("The Asus price is: " + asus.price);
        System.out.println(asus.isNotebook);
        System.out.println(asus.hardDiskMemory);
        System.out.println(asus.freeMemory);
        System.out.println(asus.operationSystem);
    }
}
