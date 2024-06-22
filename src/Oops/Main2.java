package Oops;

public class Main2 {
    public static void main(String[] args) {
        vehicle2 car = new Car2();
        vehicle2 bike = new Bike2();

        car.startEngine();
        bike.startEngine();

        car.stopEngine();
        bike.stopEngine();

        if(car instanceof Car2){
            ((Car2) car).openTrunk();
        }
        if(bike instanceof Bike2){
            ((Bike2) bike).kickStart();
        }




    }
}
