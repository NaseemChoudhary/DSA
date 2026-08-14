class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            // Check whether the current digit is smaller than 9.
            if (digits[i] < 9) {
            // If it is smaller than 9, we can simply add 1 to it.
                digits[i]++;
            // We can immediately return because we are DONE.
                return digits;
            }
             // IMPORTANT:
            // This check is NOT only for the first digit we look at.
            // The loop allows us to check EVERY digit from right to left.
           
            // If the digit is 9, adding 1 makes it 10.
            // We cannot store 10 in a single digit.
            // So this digit becomes 0, and the "carry" moves
            // to the digit on the left.
            digits[i] = 0;
            // Then the loop moves to the left and checks 2.
        }

        // If we reach this point, it means EVERY digit was 9.
        // Therefore, we need an array with ONE EXTRA space.
        int[] result = new int[digits.length + 1];

        // A newly created int array contains 0 in every position.
        //
        // So:
        // new int[4]
        //
        // gives:
        // [0, 0, 0, 0]
        //
        // We only need to put 1 at the beginning:
        // [1, 0, 0, 0]
        result[0] = 1;

        // Return the new array.
        return result;
    }
}
