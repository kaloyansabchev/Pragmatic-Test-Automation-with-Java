package inclass;

public class Computer {
    int year;
    int price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;

    Computer() {
        isNotebook = false;
        operationSystem = "Win XP";
    }

    Computer(boolean isNotebook, String operationSystem) {
        this.isNotebook = isNotebook;
        this.operationSystem = operationSystem;
    }

    Computer(int year, int price, double hardDiskMemory, double freeMemory) {
        this.year = year;
        this.price = price;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
    }

    Computer(int year, int price, boolean isNotebook, double hardDiskMemory,
             double freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.hardDiskMemory = hardDiskMemory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    int comparePrice(Computer othercomp){
        if (price > othercomp.price){
            return -1;
        }else if (price < othercomp.price){
            return 1;
        }else {
            return 0;
        }

    }
    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("The new operation system for the computer is changed to: " + newOperationSystem);
    }

    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            freeMemory = freeMemory - memory;
            System.out.println("The memory for one of the computers is reduced with " + memory + "GB and now the free space is:" + freeMemory + "GB.");
        }
    }
}
