package Interfaces.com;

public class Main {
    public static void main(String[] args) {

//       Engine car = new Car();

//        car.acc();
//        car.start();
//        car.stop();

//        Media carm = new Car();
//        carm.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();


    }
}
