// less optimal
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers cannot be palindromes
        if (x < 0) {
            return false;
        }

        int temp = x;
        int reverse = 0; // Stores the reversed number

        while (temp != 0) { // Process each digit
            reverse *= 10;          // Shift digits left
            reverse += temp % 10;   // Add the last digit
            temp /= 10;             // Remove the last digit
        }

        return reverse == x;
    }
}

// Best Optimal
class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending in 0 (except 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        // Even digits: x == reversedHalf
        // Odd digits: x == reversedHalf / 10
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
