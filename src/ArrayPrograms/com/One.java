package ArrayPrograms.com;

public class One {

   static int linearSearch(int[] arr, int element){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;

            }

        }
        return -1;

    }

    public static void main(String[] args) {

    int[] arr = {7,8,5,20,56,78};
    int element = 20;

    int searchIndex = linearSearch(arr, element);

        System.out.println("the element found at index " + searchIndex);

    }
}