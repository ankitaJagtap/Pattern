/**
 * OddEvenReversePrint
 */
public class OddEvenReversePrint {

    public static void oddEvenReversePrint(int n) {

        for (int i = 0; i < n; i++) {
            int count = n;
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(count-- + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        oddEvenReversePrint(n);
    }
}