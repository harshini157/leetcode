class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // just add 1
                return digits; // done
            }
            digits[i] = 0; // carry over
        }

       
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
