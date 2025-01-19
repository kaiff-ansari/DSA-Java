package practiceQuestion.com;

import java.util.Scanner;

public class Thirteen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the principal amount");
        int p = sc.nextInt();
        int interest = (int)(p * 0.10);
        System.out.println(interest + " interest amount");


    }
}
