package PracticeRecursion;

import java.util.Scanner;

public class Five {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(FindGeekSeries(a,b,c,n));
        }

    }

    public static int FindGeekSeries(int a, int b, int c, int n){

        if(n == 1){
            return a;
        }

        else if(n == 2){
            return b;
        }

        else if(n == 3){
            return c;
        }

        else {
            return FindGeekSeries(a,b,c,n-1) + FindGeekSeries(a,b,c,n-2)+ FindGeekSeries(a,b,c,n-3);
        }
    }
}
