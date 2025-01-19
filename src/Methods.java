
public class Methods{

    public static void main(String[] args){


                // Size of the heart
                int size = 6;

                // Upper part
                for (int i = size / 2; i <= size; i += 2) {
                    // Left space
                    for (int j = 1; j < size - i; j += 2) {
                        System.out.print(" ");
                    }

                    // Left asterisk
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    // Middle space
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }

                    // Right asterisk
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }

                // Bottom part
                for (int i = size; i >= 1; i--) {
                    // Bottom space
                    for (int j = i; j < size; j++) {
                        System.out.print(" ");
                    }

                    // Bottom asterisk
                    for (int j = 1; j <= (i * 2) - 1; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
            }
        }


