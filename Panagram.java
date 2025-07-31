
//import java.util.HashSet;
import java.util.Arrays;;

public class Panagram {
    public static void main(String[] args) {
        // HashSet<Character> set = new HashSet<>();
        // String str = "The quick browna abcdefghijklmnopqrstuvwxyz";

        // str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // for (int i = 0; i < str.length(); i++) {
        // set.add(str.charAt(i));
        // }

        // if (set.size() == 26) {
        // System.out.println("it is a panagram");
        // } else {
        // System.out.println("not a panagram");
        // }
        boolean isPanagram = true;
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        int x = 0;
        String str = "abcdefghijklmnopqrstuvwxyz";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            x = (int) 'z' - str.charAt(i);
            arr[x] = 1;
        }
        for (int i = 0; i < 25; i++) {
            if (arr[i] == 0) {
                isPanagram = false;
                return;

            }
        }
        if (isPanagram == true) {
            System.out.println("panagram");
        } else {
            System.out.println("not panagram");
        }

    }
}
// CHECK THE CORRECTNESS OF THE PROGRAM or use this a[97-b[i]]++; where b is the
// string like b="abcdef..."
