class Solution {
    public int maxArea(int[] height) {
        int l1 = 0;
        int l2 = height.length - 1;
        int width = l2 - l1;
        int volume = Math.min(height[l1], height[l2]) * width;
        int max = volume;

        while (l1 < l2) {
            if (height[l1] < height[l2]) {
                volume = Math.min(height[l1], height[l2]) * width;
                l1++;

            } else if (height[l1] > height[l2]) {
                volume = Math.min(height[l1], height[l2]) * width;
                l2--;
            } else if (height[l1] == height[l2]) {
                volume = height[l1] * width;
                l2--;
                l1++;
            }
            max = Math.max(volume, max);
            width = l2 - l1;
        }
        return max;
    }
}