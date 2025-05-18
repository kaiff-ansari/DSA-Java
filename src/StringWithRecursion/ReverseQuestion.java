package StringWithRecursion;

public class ReverseQuestion {

    public static void main(String[] args) {
        //String name = "kaif";
        System.out.println(reverse("kaif"));


    }

    static String reverse(String name){
        char[] arr = name.toCharArray();
        int start = 0;
        int end = name.length()-1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }

        return new String(arr);
    }

    static void swap(char[] arr, int a, int b){

        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
