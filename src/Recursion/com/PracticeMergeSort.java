package Recursion.com;

import java.util.Arrays;

public class PracticeMergeSort {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,6};
        MergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static void MergeSortInPlace(int[] arr, int s,int e){

        if(e -s == 1){
            return;
        }

        int mid = (s+e)/2;

        MergeSortInPlace(arr,s,mid);
        MergeSortInPlace(arr,mid,e);
        MergeInPlace(arr,s,mid,e);
    }

    static void MergeInPlace(int[] arr, int s, int m, int e){

        int[] ans = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){

          if(arr[i] < arr[j]){
              ans[k] = arr[i];
              i++;
          }

          else {
              ans[k] = arr[j];
              j++;
          }
          k++;
        }

        while(i < m){
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            ans[k] = arr[j];
            j++;
            k++;
        }

        for(int z = 0; z < ans.length; z++){
            arr[s+z] = ans[z];
        }


    }
}
