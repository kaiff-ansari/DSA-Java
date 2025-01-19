package practiceQuestion.com;

import java.util.*;

public class Six {
    // Armstrong number
    public static void main(String[] args) {



        int n = 9474;
        int sum = 0;
        int realNumber = n;
        int noOfDigit = String.valueOf(n).length();

        while(n != 0){
            int last = n % 10;
            sum+= Math.pow(last,noOfDigit);
            n = n / 10;
        }

        if(sum == realNumber){
            System.out.println(realNumber + " is armstrong number");
        }
        else{
            System.out.println( realNumber + " not armstrong number");
        }



    }


}
