class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int last = x % 10;
            x = x / 10;
            if (last > 7) {
                return 0;
            }
            if (last < -8) {
                return 0;
            }
            rev = (rev * 10) + last;
        }
        return rev;
    }
}