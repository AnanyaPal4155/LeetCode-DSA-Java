public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] accounts = {
                {2, 8, 1},
                {5, 3, 4},
                {7, 1, 6}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {

            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {

                sum += accounts[person][account];
            }

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
