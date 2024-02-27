public class RemoveElement{
    public static int removeElement(int[] nums, int val) {
        int i = 0, count = 0;
        int[] newnums = new int[nums.length];
        while(i<nums.length){
            if(nums[i] != val){
                newnums[count] = nums[i];
                count++;
            }
            i++;
        }
        return count;
        
    }
    static int[] nums = {3,2,2,3};
    public static void main(String[] args) {
        int count = removeElement(nums, 3);
        System.out.println(count);
    }

}