package inclass;

public class Computer {
    String name;
    int year;
    double price;
    boolean isNotebook;
    int hardDiskMemory;
    double freeMemory;
    String operationSystem;

    void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
        System.out.println("The new operation system is:" + newOperationSystem);
    }

    void useMemory(double memory) {
        if (memory > freeMemory) {
            System.out.println("Not enough free memory!");
        } else {
            freeMemory = freeMemory - memory;
        }
    }
}
