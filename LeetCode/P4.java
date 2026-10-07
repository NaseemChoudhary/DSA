public class P4 {

    static class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] merge = new int[nums1.length + nums2.length];
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] >= nums2[j]) {
                    merge[k] = nums2[j];
                    j++;
                } else {
                    merge[k] = nums1[i];
                    i++;
                }
                k++;
            }
            while (i < nums1.length) {
                merge[k] = nums1[i];
                i++;
                k++;
            }

            while (j < nums2.length) {
                merge[k] = nums2[j];
                j++;
                k++;
            }
            if (merge.length % 2 == 0) {
                double center = (merge[merge.length / 2 - 1]
                            + merge[merge.length / 2]) / 2.0;

                return center;
            } else {
                return merge[merge.length / 2];
            }
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        // Test 1
        int[] nums1 = { 1, 3 };
        int[] nums2 = { 2 };

        System.out.println("Test 1");
        System.out.println("Output: " +
                solution.findMedianSortedArrays(nums1, nums2));
        System.out.println("Expected: 2.0");
        System.out.println();

        // Test 2
        int[] nums3 = { 1, 2 };
        int[] nums4 = { 3, 4 };

        System.out.println("Test 2");
        System.out.println("Output: " +
                solution.findMedianSortedArrays(nums3, nums4));
        System.out.println("Expected: 2.5");
        System.out.println();

        // Test 3
        int[] nums5 = { 0, 0 };
        int[] nums6 = { 0, 0 };

        System.out.println("Test 3");
        System.out.println("Output: " +
                solution.findMedianSortedArrays(nums5, nums6));
        System.out.println("Expected: 0.0");
        System.out.println();

        // Test 4
        int[] nums7 = {};
        int[] nums8 = { 1 };

        System.out.println("Test 4");
        System.out.println("Output: " +
                solution.findMedianSortedArrays(nums7, nums8));
        System.out.println("Expected: 1.0");
    }

}