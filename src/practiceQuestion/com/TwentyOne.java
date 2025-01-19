package practiceQuestion.com;

public class TwentyOne {

    public static void main(String[] args) {
        int n = 7;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




