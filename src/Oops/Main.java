package Oops;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.start();
        vehicle.stop();

        car.start();
        car.stop();
    }

}
