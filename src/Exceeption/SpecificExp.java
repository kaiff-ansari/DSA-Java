package Exceeption;

import java.util.Scanner;

public class SpecificExp {

    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 5;
        marks[1] = 6;
        marks[2] = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int ind = sc.nextInt();

        System.out.println("enter the number you want to divided with ");
        int number = sc.nextInt();

        try{
            System.out.println("the value at array index entered is " + marks[ind]);
            System.out.println("the value of array-value/number is " + marks[ind]/number);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("the exeception is due to ");
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println("exception occured due to : ");
            System.out.println(e);
        }


    }
}
