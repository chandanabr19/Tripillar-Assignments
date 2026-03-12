public class PartitionArray {
    public static void partition(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, -7, -3, 4, -5, 6, -1};

        partition(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}