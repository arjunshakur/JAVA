public class RotateK {
    public static void reverse(int start, int end, int[] arr) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int temp[] = arr.clone();
        int c = 0;
        int k = 3;
        int rem;
        int n = arr.length;
        k = k % n;
        if (k > 0) {
            reverse(0, n - 1, arr);
            reverse(0, k - 1, arr);
            reverse(k, n - 1, arr);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != temp[i]) {
                c++;
            }
        }
        System.out.println("total changes:" + c);
    }

}
// simple approach- given k
// make a new rotated array - int[] rott = new int[n]
// run a loop from 0 till n
// and now is the main part
// rott[(k+i)%n]=arr[i]
