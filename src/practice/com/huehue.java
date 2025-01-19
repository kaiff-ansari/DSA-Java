package practice.com;

class A{

    void saysomething(){
        System.out.println("good evening");
    }
}

class B extends A{

    void nothing(){
        System.out.println("nothing");
    }

    void saysomething(){
        System.out.println("good night");
    }
}
class huehue{

    public static void main(String[] args) {

        A b = new B();
        b.saysomething();

    }
}