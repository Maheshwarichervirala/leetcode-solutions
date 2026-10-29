public class Solution {
    public int reverseBits(int n) {
        String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        
        String reversedString = new StringBuilder(binaryString).reverse().toString();
        
        return Integer.parseUnsignedInt(reversedString, 2);
    }
}
