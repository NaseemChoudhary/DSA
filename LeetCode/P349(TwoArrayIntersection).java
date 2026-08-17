import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        // Store all unique elements of nums1 in a HashSet
        // HashSet gives O(1) average time for contains()
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        // Store the common elements
        ArrayList<Integer> result = new ArrayList<>();

        // Check every element of nums2
        for (int num : nums2) {

            // If nums2 element exists in nums1
            if (set.contains(num)) {

                // Add it to the result
                result.add(num);

                // Remove it so the same element
                // cannot be added again
                set.remove(num);
            }
        }

        // Convert ArrayList<Integer> to int[]
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
