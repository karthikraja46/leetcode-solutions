import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        Integer[] boxedArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            boxedArr[i] = arr[i];
        }

        Arrays.sort(boxedArr, (a, b) -> {
            int countA = countBit(a);
            int countB = countBit(b);

            if (countA != countB) {
                return countA - countB;
            } else {
                return a - b;
            }
        });

        for (int i = 0; i < n; i++) {
            arr[i] = boxedArr[i];
        }

        return arr;
    }

    private int countBit(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }
}
