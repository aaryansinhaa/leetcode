//import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return null;

        
        
        
    }
    public static void main(String[] args){
        int[] nums = {10,2,13,14};
        int [] index = twoSum(nums, 12);
        System.out.println(index);
    }
}
