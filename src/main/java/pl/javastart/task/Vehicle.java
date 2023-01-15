package pl.javastart.task;

public class Vehicle {
    protected String name;
    protected int tankCapacity;
    protected double averageFuelConsumption;

    public Vehicle(String name, int tankCapacity, double averageFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.averageFuelConsumption = averageFuelConsumption;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", averageFuelConsumption=" + averageFuelConsumption +
                '}';
    }
}
