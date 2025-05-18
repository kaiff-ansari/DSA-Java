package PracticeOop;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        this.weight = -1;

    }

    BoxWeight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;

    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;

    }

}
