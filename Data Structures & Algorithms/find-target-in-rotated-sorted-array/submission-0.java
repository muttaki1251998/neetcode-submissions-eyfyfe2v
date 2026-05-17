class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return mid;
            }

            // left side sorted
            if(nums[mid] >= nums[left]){
                if(target < nums[mid] && target >= nums[left]) {
                    // target is in the left side, bring right up
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            // right side sorted 
            else {
                if(target > nums[mid] && target <= nums[right]){
                    // target is in the right side, bring left up
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
