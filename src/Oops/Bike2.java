package Oops;

public class Bike2 extends vehicle2{
    @Override
    void startEngine(){
        System.out.println("Bike has been stopped");
    }
    void kickStart(){
        System.out.println("Start bike using Kickstart");
    }
}
