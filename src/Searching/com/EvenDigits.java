package Searching.com;

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(FindNumbers(nums));

    }

    static int FindNumbers(int[] nums){
        int count = 0;

        for(int item : nums){
            if(even(item)){
                count++;
            }
        }
        return count;
    }

    // Function contains that check even or not
    static boolean even(int num){
        int NumberOfdigit = digits(num);

        if(NumberOfdigit % 2 == 0){
            return true;
        }
        return false;


    }

    // count the number of digits in a number
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
             num = num/10;
        }
        return count;
    }


}
