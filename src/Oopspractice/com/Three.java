package Oopspractice.com;



class B {
    private String name;
    private int marks;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getMarks(){
        return marks;
    }
}
public class Three {

    public static void main(String[] args) {

        // Implementation of Encapsulation
        B b = new B();
        b.setMarks(78);
        b.setName("kaif");
        System.out.println(b.getMarks());
        System.out.println(b.getName());

    }
}
