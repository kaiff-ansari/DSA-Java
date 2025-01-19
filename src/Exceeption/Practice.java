package Exceeption;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

//        try{
//            int a = 666/0;
//        }
//
//        catch (IllegalArgumentException e){
//            System.out.println("illegal exception");
//        }
//
//        catch (ArithmeticException e){
//            System.out.println("it is arithmetic exception");
//        }
//
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 60;
        marks[1] = 65;
        marks[2] = 70;

        Scanner sc = new Scanner(System.in);
        int index;

        int i = 0;
        while (flag && i < 5){


            try{
                System.out.println("enter the value of index");
                index = sc.nextInt();
                System.out.println("the value of marks of index is " + marks[index]);
                break;

            }
            catch (Exception e){
                System.out.println("invalid index");
                i++;
            }
        }

        if(i<=5){
            System.out.println("error");
        }


    }
}
