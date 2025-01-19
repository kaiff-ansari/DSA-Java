package Exceeption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // logical error Demo
        // write a program to print all prime numbers btw 1 to 10
        System.out.println(2);
      for(int i = 0; i <5; i++){

          System.out.println(2 * i + 1);
      }

      // Runtime error

        Scanner sc = new Scanner(System.in);
        int k  = sc.nextInt();


        System.out.println("integer part of 1000 divided by k is " + 1000/k);


    }
}
