class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int i = 0; // left pointer
        int j = 0; // right pointer

        while (j < n) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
            }
            j++;
        }
    }
}
