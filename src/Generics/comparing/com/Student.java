package Generics.comparing.com;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+ "" ;
    }

   @Override
   public int compareTo(Student o) {
      int diff = (int)(this.marks - o.marks);
       return diff;

      // if diff == 0 which means both are equal
        // if diff  < 1 means o us bigger else o is smaller
   }
}
