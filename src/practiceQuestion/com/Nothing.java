package practiceQuestion.com;

import java.util.Scanner;

public class Nothing {

    public static void CheckVote(int age){
        if(age>= 18){
            System.out.println("you can vote");
        }
        else {
            System.out.println("not vote");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        CheckVote(age);
    }

}
