package practice2;

interface Biky{


    void speedy(int increase);
    void whileBreak(int decrease);
}

class Bullet implements Biky{
    int speedy = 100;
    @Override
    public void speedy(int increase) {
        speedy = speedy + increase;
        System.out.println(speedy);
    }

    @Override
    public void whileBreak(int decrease) {
        speedy = speedy - decrease;
        System.out.println(speedy);

    }
}


public class huehue {
    public static void main(String[] args) {
        Bullet b = new Bullet();
        b.speedy(10);
        b.whileBreak(40);


    }
}
