
public class OnesAfterZeros {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 0 };
        int n = arr.length;
        int c = 0;
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n - 1; j++) {
        // if (arr[i] == 0 && arr[j] == 1) {
        // c++;
        // }

        // }
        // }
        int ones = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                ones++;
            } else if (arr[i] == 0) {
                c = c + ones;
            }
        }
        System.out.println(c);

    }
}
