package SubsStringsQuestion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class removefirstNegative {

    public static void main(String[] args){

        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;


        System.out.println(firstNegInt(arr,k));
    }


        // write code here

    static List<Integer> firstNegInt(int arr[], int k) {

        int r = 0, l = 0;

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        while (r < arr.length){

            if(arr[r] < 0){
                queue.add(arr[r]);
            }

            if((r-l+1) < k){
                r++;
            }

            else if((r-l+1) == k){

                if(queue.isEmpty()){
                    ans.add(0);
                }

                else {
                    ans.add(queue.peek());
                }

                if (!queue.isEmpty() && arr[l] == queue.peek()){
                    queue.poll();
                }

                l++;
                r++;



            }
        }

        return ans;
    }

}
