package Oops;

public class Car extends Vehicle {
    @Override
    public void stop(){
        System.out.println("The Car has been stopped");
    }
    public void start(){
        System.out.println("The Car has been started");
    }

}
