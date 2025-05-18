package practiceInterface;

public class Car implements Engine,Brake,Media{


    @Override
    public void brake() {
        System.out.println("I brake like a normal car ");
    }

    @Override
    public void start() {

        System.out.println("I start engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("i accelrate like a normal car ");

    }

    @Override
    public void stop() {
        System.out.println("i stop engine like a normal car ");

    }
}
