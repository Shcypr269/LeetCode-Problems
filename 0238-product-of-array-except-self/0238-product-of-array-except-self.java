import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        // int[] prefix = new int[nums.length];
        // int[] suffix = new int[nums.length];
        int suff = 1;

        // prefix 
        // Arrays.fill(prefix, 1);
        Arrays.fill(answer,1);
        for (int i = 1; i < nums.length; i++) {
            // prefix[i] = prefix[i - 1] * nums[i - 1];
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // suffix 
        // Arrays.fill(suffix, 1);
        for (int i = nums.length - 2; i >= 0; i--) {
            suff=suff * nums[i+1];
            answer[i] = answer[i] * suff;
        }

        // multiply
        // for (int i = 0; i < nums.length; i++){
        //     answer[i] = answer[i] * suffix[i];
        // }

            return answer;
    }
}
