package practiceQuestion.com;

public class Fifteen {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){

            for(int space = n-i; space >= 1; space--){
                System.out.print(" ");
            }

            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
