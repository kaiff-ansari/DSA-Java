package Recursion.com;

public class Table {

    public static void printTable(int n, int multiply){

        if(multiply > 10){
            return;
        }

        System.out.println(n * multiply);
        printTable(n,multiply+1);
    }

    public static void main(String[] args) {

        printTable(2,1);

    }
}
