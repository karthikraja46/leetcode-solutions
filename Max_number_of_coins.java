class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);

        // 1 2 2 4 7 8 
        //   i   j

        int i = 0;
        int j = n - 1;
        int ans = 0;

        while (i < j) {
            i++;
            j--;

            if (i > j)
                break;

            ans += piles[j];
            j--;
        }
        return ans;
    }
}
