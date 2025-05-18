package AbstractPractice;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career(){
        System.out.println("i want to be a doctor ");

    }

    @Override
    void partner(){
        System.out.println(" i love Iron man");
    }
}
