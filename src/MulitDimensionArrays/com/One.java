package MulitDimensionArrays.com;

public class One {

    // print 2D array

    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4 },
                       {5,6,7,8},
                     {9,10,11,12}};

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
