package AbstractDemo.com;

public class Daughter extends Parent{

    public Daughter(int age) {
        this.age = age;
    }
    @Override
    void career(){
        System.out.println("i am gonig to be a  coder" );
    }

    @Override
    void partner(){
        System.out.println("i love  him " );
    }

}
