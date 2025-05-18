package practiceInterface;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//        car.acc();
//        car.start();
//        car.brake();

//        Media carmedia = new Car();
//        carmedia.start();
//        carmedia.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
