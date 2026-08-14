class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
	   // This check if the digit is smaller then 9 if it is adds one to it and move forward its seems simple to understand for the first one but it doesnt only work for the first didgits it move for the all the digits so its doable 
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
}
