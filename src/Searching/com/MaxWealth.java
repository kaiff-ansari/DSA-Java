package Searching.com;

public class MaxWealth {

    public int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;

        for(int person = 0; person < accounts.length; person++){
            // before starting new row take a new sum of row
            int sum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];

            }
            // now we have sum of accounts of person
            // check with overall ans
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
    public static void main(String[] args) {







    }


}
