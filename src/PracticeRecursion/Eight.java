package PracticeRecursion;

import java.util.Arrays;

public class Eight {

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));


    }

    static void Mergesort(int[] arr, int s, int e ){

        if(e - s == 1){
            return;
        }

        int mid = (s+e)/2;

        Mergesort(arr, s,mid);
        Mergesort(arr,mid,e);
        MergeInplace(arr,s,mid,e);
    }

    static void MergeInplace(int[] arr, int s, int m, int e){

        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){

            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int z = 0; z < mix.length; z++){
            arr[s+z] = mix[z];
        }
    }

}
