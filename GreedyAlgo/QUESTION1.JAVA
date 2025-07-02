import java.util.Arrays;

public class QUESTION1 {
    public static void main(String[] args) {
        int[][] pairs = {
            {1, 2},
            {2, 3},
            {3, 4}
        };

       
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;

        System.out.println("Selected pairs in the chain:");
        for (int[] pair : pairs) {
            int start = pair[0];
            int end = pair[1];

            if (start > lastEnd) {
                System.out.println(start + " " + end);
                lastEnd = end;
                count++;
            }
        }

        System.out.println(count);
    }
}
