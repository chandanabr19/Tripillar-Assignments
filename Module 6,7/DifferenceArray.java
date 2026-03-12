public class DifferenceArray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 40};
        int n = arr.length;

        int[] diff = new int[n + 1];

        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        update(diff, 0, 1, 10);
        update(diff, 1, 3, 20);
        update(diff, 2, 2, 30);

        int[] result = new int[n];
        result[0] = diff[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    static void update(int[] diff, int l, int r, int val) {
        diff[l] += val;
        if (r + 1 < diff.length) {
            diff[r + 1] -= val;
        }
    }
}