package Nmethod.com;

public class Factorial {

    public static void main(String[] args) {
       // System.out.println(factorial(5));
        //System.out.println(sum(5));
       // System.out.println(fib(100));
       // System.out.println(fiboFormula(100));

    }


    static int factorial(int n){

        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    static int sum(int n){

        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    static int fib(int n){
        if(n < 2){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    static long fiboFormula(int n){

        return (long)(Math.pow(((1+ Math.sqrt(5)) /2),n)/Math.sqrt(5));

    }

}
