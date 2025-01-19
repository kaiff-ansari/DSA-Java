package Exceeption;

import java.util.Scanner;

public class NestedTry {

    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 5;
        marks[1] = 6;
        marks[2] = 7;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {


            System.out.println("enter the value of index ");
            int ind = sc.nextInt();


            try {
                System.out.println("lets do multiple things ");

                try {
                    System.out.println("the value of array index is " + marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this array index does not exist ");
                    System.out.println("exception in level two");
                }
            } catch (Exception e) {
                System.out.println("exception level one ");
            }

        }
        System.out.println("thanks for using this program");
    }
}
