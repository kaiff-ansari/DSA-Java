package access.com;

public class ObjectDemo {

    int num;
    float gpa ;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
       this.gpa = gpa;
    }

    // a unique representation of object a number it is random integer no.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo )obj).num;
    }

    @Override

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }



    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(64,71.6f);
        ObjectDemo obj2 = new ObjectDemo(64, 72.5f);

        if(obj == obj2){
            System.out.println("obj is equals to obj2");
        }

        if(obj.equals(obj2)){
            System.out.println("obj is equals to obj2");

        }

        System.out.println(obj.getClass().getName());


//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }


}
