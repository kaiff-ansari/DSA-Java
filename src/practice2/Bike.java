package practice2;

public class Bike extends Scooter{

    @Override
    void speedUp(int increament) {
        speed = speed + increament;
        System.out.println(speed);
    }

    @Override
    void applybreak(int decreament) {

        speed = speed - decreament;
        System.out.println(speed);

    }
}
