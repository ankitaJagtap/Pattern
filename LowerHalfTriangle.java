/**
 * LowerHalfTriangle
 */
public class LowerHalfTriangle {

    public static void printLowerHalfTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int lines = 4;
        printLowerHalfTriangle(lines);
    }
}