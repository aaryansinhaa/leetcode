public class MergeTwoArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                System.out.println("adding " + nums1[i] + " to the array");
                nums1[k--] = nums1[i--];
            } else {
                System.out.println("adding " + nums2[j] + " to the array");

                nums1[k--] = nums2[j--];
            }
        }
        for(int x = 0; x< nums1.length; x++){
            System.out.println(nums1[x]);
        }
        
    }
    static int[] int1 = {1,2,4,6};
    static int[] int2 = {1,3,5};

    public static void main(String[] args) {
        merge(int1, int1.length, int2, int2.length);
    }
}
