class Solution {
    public int reverse(int x) {

        // Use long so that reversing the number cannot overflow
        long temp = x;
        long revs = 0;

        // Convert negative numbers to their absolute value.
        if (x < 0) {
            temp = -temp;
        }
       while (temp > 0) {
            revs = revs * 10 + temp % 10;
            temp /= 10;
        }

        // Integer limits:
        //
        // Integer.MAX_VALUE =  2147483647
        // Integer.MIN_VALUE = -2147483648
        //
        // There is one extra negative value.
        // Therefore:
        //   Positive numbers can have a maximum reversed value of
        //   Integer.MAX_VALUE.
        //
        //   Negative numbers are allowed an absolute reversed value of
        //   2147483648L because it becomes Integer.MIN_VALUE after
        //   restoring the negative sign.

        if (x < 0) {

            // Anything larger than 2147483648 cannot fit even after
            // applying the negative sign.
            if (revs > (1L << 31)) {
                return 0;
            }

            return -(int) revs;
        }

        // Positive numbers must not exceed Integer.MAX_VALUE.
        if (revs > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) revs;
    }
}
