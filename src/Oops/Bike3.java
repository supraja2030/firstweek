package Oops;

public class Bike3 implements Vehicle3 {
    @Override
    public void engineStop(){
        System.out.println("The Bike has been stopped");
    }
    @Override
    public void engineStart(){
        System.out.println("The Bike has been started");
    }
    public void kickStart(){
        System.out.println("Kickstart the bike ");
    }


}
