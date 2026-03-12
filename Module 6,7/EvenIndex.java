public class EvenIndex {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int i = 0, j = 1;

        while (i < n && j < n) {
            if (arr[i] % 2 == 0) {
                i += 2;
            } else if (arr[j] % 2 == 1) {
                j += 2;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i += 2;
                j += 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 12, 1, 5, 8};

        rearrange(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}