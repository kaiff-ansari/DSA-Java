package ArrayPrograms.com;

public class oop {
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {

      // Student s1 = new Student("altaf",75,63.4f);
//        Student s = new Student();
//        System.out.println(s.name);
//
//        Student one = new Student();
//        Student two = one;
//        one.name = "naved";
//        System.out.println(two.name);

//       int a = 10;
//       int b = 15;
//
//        System.out.println(a + " " + b);
//        swap(a,b);



        A ob = new A("altaf");
        System.out.println(ob);

    }


}

class Student{
    String name;
    int roll;
    float marks;
    Student(){


        this("default name", 45,69.f);
    }

    Student(String name, int roll , float marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }


}

class A{
    String name;

    public A(String name){
        this.name = name;
    }


}

