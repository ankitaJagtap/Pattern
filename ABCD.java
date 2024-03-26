/**
 * ABCD
 */
public class ABCD {

    public static void printABCD(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0, ch = 97; j < n; j++, ch++) {
                System.out.print((char) ch + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int n = 4;
        printABCD(n);
    }
}