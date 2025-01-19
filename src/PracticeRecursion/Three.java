package PracticeRecursion;

public class Three {

    public static void main(String[] args) {
       printNumber(10);

    }

    static void printNumber(int n){

        if(n == 0){
            return;
        }


        printNumber(n-1);
        System.out.println(n);

    }
}
