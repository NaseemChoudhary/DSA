class Solution {
    public void reverseString(char[] s) {

        // Pointer starting from the beginning of the array
        int left = 0;

        // Pointer starting from the end of the array
        int right = s.length - 1;

        // Continue until both pointers meet or cross each other
        while (left < right) {

            // Store the left character temporarily
            char temp = s[left];

            // Move the right character to the left position
            s[left] = s[right];

            // Move the original left character to the right position
            s[right] = temp;

            // Move the left pointer one position forward
            left++;

            // Move the right pointer one position backward
            right--;
        }
    }
}
