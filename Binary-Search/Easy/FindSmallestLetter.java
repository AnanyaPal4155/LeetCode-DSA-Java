//https:leetcode.com/problems/find-smallest-letter-greater-than-target/

public class FindSmallestLetter {

    public static void main(String[] args) {

        // Example 1
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';

        System.out.println(
                nextGreatestLetter(letters1, target1)
        ); // Output: c


        // Example 2
        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';

        System.out.println(
                nextGreatestLetter(letters2, target2)
        ); // Output: f


        // Example 3
        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';

        System.out.println(
                nextGreatestLetter(letters3, target3)
        ); // Output: x


        // Example 4
        char[] letters4 = {'c', 'f', 'j'};
        char target4 = 'j';

        System.out.println(
                nextGreatestLetter(letters4, target4)
        ); // Output: c
    }


    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }
}
