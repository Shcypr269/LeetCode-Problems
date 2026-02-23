class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Step 1: Count frequencies (assuming range 0-1000)
        int[] count = new int[1001];
        for (int num : arr1) {
            count[num]++;
        }

        int[] result = new int[arr1.length];
        int index = 0;

        // Step 2: Fill result based on arr2 order
        for (int num : arr2) {
            while (count[num] > 0) {
                result[index++] = num;
                count[num]--;
            }
        }

        // Step 3: Fill remaining elements in ascending order
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[index++] = i;
                count[i]--;
            }
        }

        return result;
    }
}