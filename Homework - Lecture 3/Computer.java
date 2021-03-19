package inclass;

public class Computer {
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("The new operation system for one of the computers is changed to: " + newOperationSystem);
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
