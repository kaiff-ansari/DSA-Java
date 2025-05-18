package AbstractPractice;

public class Main {

    public static void main(String[] args) {

        Son son = new Son(22);
        son.career();
        son.greet();


        Parent.hello();
        Daughter d = new Daughter(26);
        d.career();


    }
}
