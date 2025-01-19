package practiceQuestion.com;

public class Seventeen {

    // print reverse pyramid star

    public static void main(String[] args) {

        int n = 7;
        for(int i = n; i>=1; i-- ){
            for(int space = i; space<= n; space++){
                System.out.print(" ");
            }
            for(int j = i; j<= (2 * i - 1); j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }



    }
}
