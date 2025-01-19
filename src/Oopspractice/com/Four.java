package Oopspractice.com;

class Base {
    String name;
    int salary;

    public Base(String name , int salary){
        this.name = name;
        this.salary = salary;
    }
}

class Derived extends Base {

    int age;
    public Derived(String name , int salary, int age){
        super(name,salary);
        this.age = age;
    }

    public void display(){
        System.out.println("name of employment is "  + name + " age is " + age +  " salary is " + salary);

    }
}
public class Four {
    // Implementation of inheritance
    public static void main(String[] args) {
        Derived d = new Derived("kaif", 30000, 18);
        d.display();



    }
}
