package pl.javastart.task;

public class Truck extends Car {
    public static final double FUEL_USAGE_WITH_AIR_CONDITION = 1.6;
    public static final double FUEL_USAGE_FOR_100_KG_LOAD_WEIGHT = 0.5;
    private double loadWeight;

    public Truck(String name, int tankCapacity, double averageFuelConsumption, boolean isClimaOn, double loadWeight) {
        super(name, tankCapacity, averageFuelConsumption, isClimaOn);
        this.loadWeight = loadWeight;
    }

    @Override
    public double calculateRange() {
        double fuelNeededForLoad = FUEL_USAGE_FOR_100_KG_LOAD_WEIGHT * (loadWeight / 100);
        if (isClimaOn) {
            return tankCapacity / (averageFuelConsumption + FUEL_USAGE_WITH_AIR_CONDITION + fuelNeededForLoad)
                    * 100;
        } else {
            return tankCapacity / (averageFuelConsumption + fuelNeededForLoad)
                    * 100;
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "isClimaOn=" + isClimaOn +
                ", loadWeight=" + loadWeight +
                ", name='" + name + '\'' +
                ", tankCapacity=" + tankCapacity +
                ", averageFuelConsumption=" + averageFuelConsumption +
                '}';
    }
}
