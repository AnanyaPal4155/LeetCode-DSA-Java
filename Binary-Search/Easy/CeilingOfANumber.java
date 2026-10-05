public class CeilingOfANumber {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 7, 8, 9, 10};
        int target = 6;

        System.out.println(Search(arr, target));
    }


    public static int Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;


    }


}
