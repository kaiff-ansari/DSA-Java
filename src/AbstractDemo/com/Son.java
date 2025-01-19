package AbstractDemo.com;

public class Son extends Parent{
    public Son(int age) {
        this.age = age;
    }

    @Override
    void career(){
        System.out.println("i am gonig to be a doctor" );
    }

    @Override
    void partner(){
        System.out.println("i love her" );
    }


}
