package Oops;

public class Car3 implements Vehicle3{
    @Override
    public void engineStop(){
        System.out.println("The Car has been stopped");
    }
    @Override
    public void engineStart(){
        System.out.println("The car has been started");
    }
    public void openBoot(){
        System.out.println("The car boot has been opened");
    }


}