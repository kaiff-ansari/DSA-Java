package practiceQuestion.com;

import java.util.Scanner;

public class Tweleve {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int N1 = 0;
        int N2 = 1;
        System.out.println(N1 + " " + N2);
        int fibN;

        for(int i = 1; i<= n; i++){
             fibN = N1 + N2;
            if(fibN % 2 == 0){
                System.out.println(fibN);
            }


            N1 = N2;
            N2 = fibN;


        }

    }
}
