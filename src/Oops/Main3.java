package Oops;

public class Main3 {
    public static void main(String[] args) {
        Vehicle3 car = new Car3();
        Vehicle3 bike = new Bike3();

        car.engineStart();
        car.engineStop();

        bike.engineStart();
        bike.engineStop();

        if(car instanceof Car3){
            ((Car3)car).openBoot();
        }
        if(bike instanceof Bike3){
            ((Bike3)bike).kickStart();
        }

    }
}
