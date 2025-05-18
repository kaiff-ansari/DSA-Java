package SubsStringsQuestion;

import java.util.ArrayList;

public class DuplicateRemove {

    public static void main(String[] args) {

        int[] nums = {1,1,2,0,0,5};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int uniqueIndex = 1;
        ArrayList<Integer> list = new ArrayList<>();


        for(int i = 1; i < nums.length; i++){

            if(nums[i] != nums[i-1]){
                list.add(nums[i]);

                nums[uniqueIndex] = nums[i];

                // insert unique element in unique index
                uniqueIndex++;

            }


            else {
                continue;
            }
        }

        System.out.println(list);


        return uniqueIndex;

    }
}
