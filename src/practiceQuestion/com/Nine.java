package practiceQuestion.com;

import java.util.Scanner;

public class Nine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      int first = 0;
      int second = 1;


      for(int i = 2; i <= n; i++){
          int fibN = first + second;
          System.out.println(fibN);

      }




    }
}
