public class OrderAgnosticBS {

    public static void main(String[] args) {

        // Ascending array
        int[] arr = {1, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;

        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // Check whether array is ascending or descending
        boolean isAsc;

        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while (start <= end) {

            int mid = (start + end) / 2;

            // Target found
            if (target == arr[mid]) {
                return mid;
            }

            // Ascending array
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            // Descending array
            else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}gi
