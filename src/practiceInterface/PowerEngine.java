package practiceInterface;

public class PowerEngine implements Engine{


    @Override
    public void start() {
        System.out.println("power Engine start");
    }

    @Override
    public void acc() {

        System.out.println("Accelerate power engine ");
    }

    @Override
    public void stop() {

        System.out.println("power engine stop ");
    }
}
