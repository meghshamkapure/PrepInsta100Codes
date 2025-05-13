public class LC1672_RichestCustomerWealth {
    public static void main(String args[]) {
        int accounts1[][] = {
                { 1, 5 },
                { 7, 3 },
                { 3, 5 }
        };

        int accounts2[][] = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };

        System.out.println(maximumWealth(accounts1));

        System.out.println(maximumWealth(accounts2));

    }

    public static int maximumWealth(int[][] accounts) {
        int maxWelth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int accountSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                accountSum = accountSum + accounts[i][j];
            }

            if (accountSum > maxWelth)
                maxWelth = accountSum;
        }
        return maxWelth;
    }
}