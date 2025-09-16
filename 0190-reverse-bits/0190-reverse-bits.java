class Solution {
    public int reverseBits(int n) {
        // Convert to 32-bit binary string
        String s = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');

        // Reverse the string
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();

        // Parse the reversed string as binary
        return (int) Long.parseLong(s2, 2);
    }
}
