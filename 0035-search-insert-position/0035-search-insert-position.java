class Solution {

    public static int sInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int result = n;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] >= target) {
                result = mid;

                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public int searchInsert(int[] nums, int target) {
        return Solution.sInsert(nums, target);
    }
}