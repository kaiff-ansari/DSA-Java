package ArrayPrograms.com;

import java.util.Arrays;

public class Eleven {
    public static void main(String[] args) {
        String[] arr1 = {"article", "geeks", "for","geeks"};
        String[] arr2 = {"article", "geeks", "geeks"};
//        String[] temp = new String[arr1.length];


        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){

                if(arr1[i].equals(arr2[j])){
                    System.out.print(arr2[j] + " ");
                }
            }
        }


    }
}
