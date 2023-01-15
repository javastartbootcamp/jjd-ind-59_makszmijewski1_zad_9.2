package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Car bmw = new Car("BMW", 63, 11, false);
        Car mercedes = new Car("Mercedes", 80, 14, false);
        Truck scania = new Truck("Scania", 600, 11, false, 4000);

        Car[] cars = new Car[3];
        cars[0] = bmw;
        cars[1] = mercedes;
        cars[2] = scania;

        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.calculateRange());
        }

        cars[0].isClimaOn = true;
        cars[1].isClimaOn = true;
        cars[2].isClimaOn = true;

        for (Car car : cars) {
            System.out.println(car);
            System.out.println(car.calculateRange());
        }

    }
}
