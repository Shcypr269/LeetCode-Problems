class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int k = x;
        while (x != 0) {
            if (x < 0) {
                return false;
            }
            int last = x % 10;
            x = x / 10;
            rev = (rev * 10) + last;
        }
        if (rev == k) {
            return true;
        } else {
            return false;
        }
    }
}