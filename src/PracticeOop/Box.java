package PracticeOop;

public class Box {

    double h;
    double l;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;

    }

    static void greeting(){
        System.out.println("i am box class greeting! ");
    }

    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;

    }

    public void information(){
        System.out.println("i am running the box ");
    }
}
