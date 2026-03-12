import java.util.*;

public class PrefixSumRangeQuery {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 6, 3, 5};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int[][] queries = {{1, 3}, {2, 5}, {0, 4}};

        for (int[] q : queries) {
            int L = q[0];
            int R = q[1];
            int sum = (L == 0) ? prefix[R] : prefix[R] - prefix[L - 1];
            System.out.println(sum);
        }
    }
}