public class RemoveElement{
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
    static int[] nums = {3,2,2,3};
    public static void main(String[] args) {
        int count = removeElement(nums, 3);
        System.out.println(count);
    }

}