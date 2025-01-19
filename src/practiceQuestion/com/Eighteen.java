package practiceQuestion.com;

public class Eighteen {

    public static void main(String[] args) {
        int n = 7;

        for(int i = 1; i<= n; i++){

            for(int space = n - i; space>=1; space--){
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i = n; i>= 1; i--){
            for(int space = n - i; space>=1; space--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
