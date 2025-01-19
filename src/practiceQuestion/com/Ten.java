package practiceQuestion.com;

import java.util.Scanner;

// check the number is neon number

public class Ten {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        int sum = 0;

        int square = n * n;

        while(square != 0){
            int last  = square % 10;
            sum  = sum + last;
           square = square / 10;
        }
        if(sum == n){
            System.out.println(n + " is neon number");
        }
        else{
            System.out.println(n + " n is not a neon number ");
        }





    }
}
