package hashmapPc;

public class frequencyArray {

    public static void main(String[] args){

        int[] arr = {3,7,1,5,6,7,3,3,1};

        int[] hash = new int[9];

        for(int i = 0; i < arr.length; i++){

            hash[arr[i]] += 1;
        }


        for (int i = 0; i < hash.length; i++){



            if(hash[i] > 0){

                System.out.println(i + " : " + hash[i]);
            }
        }
    }
}
