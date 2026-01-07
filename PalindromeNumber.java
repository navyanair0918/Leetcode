class Solution {
    public boolean isPalindrome(int x) 
    {
        // Negative numbers and numbers ending with 0 (except 0)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x = x / 10;
        }

        // Works for both even & odd length numbers
        return (x == reversedHalf || x == reversedHalf / 10);
    }
}