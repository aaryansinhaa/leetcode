import java.util.Arrays;

public class insertLocation {
    public static int searchInsert(int[] nums, int target) {
        Arrays.sort(nums);
        if(target > nums[nums.length-1]){
            return nums.length;
        }
        if(target <= nums[0]){
            return 0;
        }
        int beg = 0, end = nums.length-1, mid = 0;
        while((beg <= end)){
            mid = (int)(beg*0.5 + end*0.5);
            if(nums[mid]< target){
                beg = mid +1;
            }else if(nums[mid]> target){
                end = mid -1;
            }else{
                return mid;
            }
        }
        for(int i = 1; i<nums.length; i++){
            if(target>nums[i-1] && target < nums[i]){
                return i;
                //break;
            }
        }
        
        return -1;
    }
    static int[] nums = {1,2,5,4,7};
    static int target = 10;
    public static void main(String[] args) {
        int index = (searchInsert(nums, target));
        System.out.println(index);
    }
}
