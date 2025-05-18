package practiceInterface;

public class ElectricEngine implements Engine{


    @Override
    public void start() {
        System.out.println("electric engine start");
    }

    @Override
    public void acc() {

        System.out.println("electric engine accelerate");
    }

    @Override
    public void stop() {

        System.out.println("electric engine stop");
    }
}
