package Generics.comparing.com;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student kaif = new Student(101,75.5f);
        Student altaf = new Student(102, 78.6f);
        Student irfan = new Student(100, 80.6f);
        Student idirisikaif = new Student(102, 90.6f);
        Student mohit =  new Student(102, 88.6f);

        Student[] list = {kaif, altaf, irfan, idirisikaif, mohit};

        System.out.println(Arrays.toString(list));

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(kaif.compareTo(altaf) < 0){
//            System.out.println(kaif.compareTo(altaf));
//            System.out.println("altaf  has more marks ");
//        }
    }
}
