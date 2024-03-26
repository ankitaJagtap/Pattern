/**
 * UpperHalfTriangle
 */
public class UpperHalfTriangle {

    public static void upperHalfTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int line = 4;
        upperHalfTriangle(line);
    }
}