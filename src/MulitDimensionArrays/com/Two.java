package MulitDimensionArrays.com;

public class Two {

    // Addition of 2D matrix

    public static void main(String[] args) {
        int[][] A = { {1,2},
                {3,4} };

        int[][] B = { {1,1},
                {1,1} };

        int size = 2;

        int[][] Sum = new int[size][size];

        for(int i = 0; i < A.length; i++){

            for(int j = 0; j < A[i].length; j++){

                Sum[i][j] = A[i][j] + B[i][j];
            }
        }

        for(int i = 0; i < A.length; i++){

            for(int j = 0; j < A[i].length; j++){

               System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }




    }
}
