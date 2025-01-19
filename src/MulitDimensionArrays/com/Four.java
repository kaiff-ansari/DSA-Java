package MulitDimensionArrays.com;


public class Four {
    // Transpose of 2D matrix


    public static void main(String[] args) {

       int[][] arr = { {1,1,1,1},
               {2,2,2,2},
               {3,3,3,3},
               {4,4,4,4}};

       int size = 4;



        int[][] transpose = new int[size][size];

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                transpose[i][j] = arr[j][i];
            }
        }

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

               System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}
