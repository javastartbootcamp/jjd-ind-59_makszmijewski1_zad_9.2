package pl.javastart.task;

public class Car extends Vehicle {
    public static final double FUEL_USAGE_WITH_AIR_CONDITION = 0.8;
    protected boolean isClimaOn;

    public Car(String name, int tankCapacity, double averageFuelConsumption, boolean isClimaOn) {
        super(name, tankCapacity, averageFuelConsumption);
        this.isClimaOn = isClimaOn;
    }

    public double calculateRange() {
        if (isClimaOn) {
            return tankCapacity / (averageFuelConsumption + FUEL_USAGE_WITH_AIR_CONDITION) * 100;
        } else {
            return tankCapacity / averageFuelConsumption * 100;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "isClimaOn=" + isClimaOn +
                ", name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", averageFuelConsumption=" + averageFuelConsumption +
                '}';
    }
}
