package Recursion.com;

public class Nto1 {

    public static void main(String[] args) {
        concept(5);

    }

    static void concept(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        //fun(n--); this is show the stack overflow error coz it will execute fun then after all of this then --
        concept(--n);
    }

    static void fun(int n){

        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funReverse(int n){

        if(n == 0){
            return;
        }

        funReverse(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }




}
