/**
 * LeftHandTriangeWithDollerInMiddle
 */
public class LeftHandTriangeWithDollerInMiddle {

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i) {
                    System.out.print("$" + " ");
                } else if (j > i) {
                    System.out.print("#" + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }
}