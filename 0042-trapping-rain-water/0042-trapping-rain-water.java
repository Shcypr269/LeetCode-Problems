public class Solution {

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int lmax = 0;
        int rmax = 0;
        int trap = 0;
        while (left < right) {
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);
            if (lmax < rmax) {
                trap += (lmax - height[left]);
                left++;
            } 
            else{
                trap += (rmax - height[right]);
                right--;
            }
        }
        return trap;
    }
}
