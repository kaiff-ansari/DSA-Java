package Inheritence;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l =-1;
        this.h = -1;


        this.w = -1;
    }

    static void greeting(){
        System.out.println("i am box class methods. greeting");
    }

    //cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

     Box(double l, double h, double w) {
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
        System.out.println("running the box");
    }
}

 class BoxWeight extends  Box{
    double weight;

    BoxWeight(){
        this.weight = -1;
    }

     static void greeting(){
         System.out.println("i am box class methods. greeting");
     }



    public BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l,h,w); // call the parent class constructor
        // used to initialize values present in parent class
        this.weight = weight;


    }
}

class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(){
        super();

        this.cost = -1;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }
}