class Solution {
    static int[] nums = {1,2,3,4};
    public static boolean containsDuplicate(int[] nums) {
        int counter = 0;
        for(int i = 0; i<nums.length; i++){

            for(int j = i+1; j< nums.length; j++){
                System.out.println(nums[i] + " "+ nums[j]);
                if(nums[i] == nums[j]){
                    counter++;
                }
            }
        }
        if(counter>0){

            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean output = containsDuplicate(nums);
        System.out.println(output);
    }
}