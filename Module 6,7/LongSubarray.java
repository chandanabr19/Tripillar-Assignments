import java.util.*;

public class LongSubarray {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLen = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;

        System.out.println(longestSubarray(arr, k));
    }
}