public class SpiralPrinting {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int top = 0, bottom = 3, left = 0, right = 3;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                System.out.print(arr[i][right]);
            }
            for (int i = right - 1; i > left; i--) {
                System.out.print(arr[bottom][i]);
            }
            for (int i = bottom; i > top; i--) {
                System.out.print(arr[i][left]);
            }
            top++;
            left++;
            right--;
            bottom--;
        }

    }
}