package practiceQuestion.com;

import java.util.Scanner;

public class Eight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        boolean isprime = true;
        if(n == 2){
            System.out.println(n + "n is prime");
        }

        for(int i = 2; i <= n; i++){

            if(n == 0 || n == 1){
                continue;
            }


            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isprime = false;
                    break;
                }

            }
            if(isprime == true){
                System.out.println( i + "   prime");

            }
          isprime = true;



        }









    }
}
