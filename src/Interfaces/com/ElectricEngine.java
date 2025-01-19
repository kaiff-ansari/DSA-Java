package Interfaces.com;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("electric engine stop");

    }

    @Override
    public void acc() {
        System.out.println("electric engine accelerate");

    }
}
