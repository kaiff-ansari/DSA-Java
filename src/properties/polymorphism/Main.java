package properties.polymorphism;

public class Main {

    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();

        circle.area();
    }
}
