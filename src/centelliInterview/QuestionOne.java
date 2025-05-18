package centelliInterview;

public class QuestionOne {

    public static void main(String[] args) {
        int[] arr =  {4,4,4,4};

        if(CheckIsPerfect(arr) == true){

            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    static boolean CheckIsPerfect(int[] arr) {
        int n = arr.length;
        int i = 1;


        while (i < n && arr[i] > arr[i - 1])
            i++;

        while (i < n && arr[i] == arr[i - 1])
            i++;


        while (i < n && arr[i] < arr[i - 1])
            i++;


        return i == n;
    }
}
