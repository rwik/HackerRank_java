//removes leading and trailing space

public class PrintAllPermutation {
    public static void printAllCombinationOfGivenLength(char[] ar, String st, int n, int k) {
        if (k == 0) {
            System.out.println(st);
            return;
        }
        for (int i = 0; i < n; ++i) {

            String newPrefix = st + ar[i];

            printAllCombinationOfGivenLength(ar, newPrefix, n, k - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("Combinations for A B C D");
        char[] ar = { 'a', 'b' };
        printAllCombinationOfGivenLength(ar, "", 2, 3);

    }
}