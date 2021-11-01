package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends Appliance {

    private double batteryCapacity;
    private String operationSystem;
    private int memoryRam;
    private int systemMemory;
    private double cpu;
    private int displayInches;



    public Laptop(int price, double batteryCapacity, String operationSystem, int memoryRam, int systemMemory, double cpu, int displayInches) {
        super(price);
        this.batteryCapacity = batteryCapacity;
        this.operationSystem = operationSystem;
        this.memoryRam = memoryRam;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }
// you may add your own code here

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 && memoryRam == laptop.memoryRam && systemMemory == laptop.systemMemory && Double.compare(laptop.cpu, cpu) == 0 && displayInches == laptop.displayInches && operationSystem.equals(laptop.operationSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, operationSystem, memoryRam, systemMemory, cpu, displayInches);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", operationSystem='" + operationSystem + '\'' +
                ", memoryRam=" + memoryRam +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }
}
