// Brue force
class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Check every possible pair.
        for (int i = 0; i < nums.length - 1; i++) {

            // Start from the next element to avoid using the same index twice.
            for (int j = i + 1; j < nums.length; j++) {

                // If the pair adds up to the target, return their indices.
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        // Return an empty array if no valid pair exists.
        return new int[] {};
    }
}
// Optimised
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Stores each number as the key and its index as the value.
        HashMap<Integer, Integer> map = new HashMap<>();

        // Traverse the array once.
        for (int i = 0; i < nums.length; i++) {

            // Calculate the number needed to reach the target.
            int complement = target - nums[i];

            // If the complement already exists, we found the pair.
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store the current number and its index.
            map.put(nums[i], i);
        }

        // Return an empty array if no valid pair exists.
        return new int[] {};
    }
}
