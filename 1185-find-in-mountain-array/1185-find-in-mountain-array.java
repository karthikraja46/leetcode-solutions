class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = getPeakElement(mountainArr);
        int result = searchInAscending(target, mountainArr, 0, peak);
        if (result == -1) {
            result = searchInDescending(target, mountainArr, peak + 1, mountainArr.length() - 1);
        }
        return result;
    }

    int getPeakElement(MountainArray mountainArr) {
        int ans = -1;
        int len = mountainArr.length();
        int low = 0;
        int high = len - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1; // Fix: Change "mid=1" to "low = mid + 1"
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }

    int searchInAscending(int target, MountainArray mountainArr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    int searchInDescending(int target, MountainArray mountainArr, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = mountainArr.get(mid);

            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
