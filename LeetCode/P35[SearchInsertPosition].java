class Solution {

    // Recursive binary search
    // Returns the index where k is found,
    // or the index where k should be inserted
    public int binarySearch(int[] arr, int l, int r, int k) {

        // Calculate the middle index.
        // This form prevents integer overflow.
        int mid = l + (r - l) / 2;

        // If left pointer crosses right pointer,
        // k does not exist in the array.
        // At this point, l is the correct insertion position.
        if (l > r) {
            return l;
        }

        // Target found
        else if (arr[mid] == k) {
            return mid;
        }

        // Target is greater than the middle element,
        // so search in the right half.
        else if (arr[mid] < k) {
            return binarySearch(arr, mid + 1, r, k);
        }

        // Target is smaller than the middle element,
        // so search in the left half.
        else if (arr[mid] > k) {
            return binarySearch(arr, l, mid - 1, k);
        }

        // Required by Java's compiler.
        return 0;
    }

    public int searchInsert(int[] nums, int target) {

        // Start binary search from the entire array.
        return binarySearch(nums, 0, nums.length - 1, target);
    }
}

// Two pointers method 
class Solution {

    public int searchInsert(int[] nums, int target) {

        // Left pointer starts at the beginning of the array
        int l = 0;

        // Right pointer starts at the end of the array
        int r = nums.length - 1;

        // Continue while there is still a valid search range
        while (l <= r) {

            // Find the middle index
            // This formula prevents integer overflow
            int mid = l + (r - l) / 2;

            // Target found, so return its index
            if (nums[mid] == target) {
                return mid;
            }

            // Target is smaller than the middle element
            // So search in the left half
            if (nums[mid] > target) {
                r = mid - 1;
            }

            // Target is greater than the middle element
            // So search in the right half
            if (nums[mid] < target) {
                l = mid + 1;
            }
        }

        // Target was not found.
        // At this point, l is the position
        // where the target should be inserted.
        return l;
    }
}
