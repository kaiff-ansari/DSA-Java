package AbstractDemo.com;

public class Main {

    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
//        son.partner();

        Daughter d = new Daughter(25);
        d.career();
        Parent.say();
//        d.partner();
    }


}
