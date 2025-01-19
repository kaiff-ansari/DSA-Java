package Exceeption;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "i am get message";
    }
}


public class exeptionClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 99){
           try {
               throw new ArithmeticException();
           }
           catch(Exception e){
               System.out.println(e.getMessage());
               System.out.println(e.toString());
               e.printStackTrace();
               System.out.println("finished");
           }
        }

    }
}
