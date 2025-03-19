
import java.util.Arrays;  
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right}; 
            } else if (sum < target) {
                left++;  
            } else {
                right--;
            }
        }
        
        return new int[]{}; 
    }
    public static void main(String[] args) {
        Solution solution = new Solution();  
        int nums[] = {3, 4, 5, 6, 7};
        int target = 10;
        
        int[] result = solution.twoSum(nums, target);
        System.out.println("The target indices are: " + Arrays.toString(result));
    }
}
