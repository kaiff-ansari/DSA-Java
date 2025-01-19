package practice2;


class rectangle{
    int l;
    int w;

    public rectangle(){
        this.l = 12;
        this.w = 15;
    }

    public rectangle(int l, int w){
        this.l = l;
        this.w = w;

    }



    public void area(){
        int area = l * w;
        System.out.println(area);
    }

}

class base extends rectangle{
    int h;

    public base(int l , int w, int h){
        super(l,w);
        this.h = h;

    }


    public void area(){
        int area = l * w * h;
        System.out.println("area of base is " + area);
    }
}
public class question {

    public static void main(String[] args) {
        base b = new base(4,6,2);
        b.area();

    }
}
