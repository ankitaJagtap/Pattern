/**
 * Pyramid
 */
public class Pyramid {

    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 5;
        printPyramid(n);
    }
}