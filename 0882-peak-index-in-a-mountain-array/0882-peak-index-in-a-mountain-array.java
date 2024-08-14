class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) start = mid + 1; // peak in right half
            else end = mid; // peak in left half including mid
        }
        return start; // start == end, peak found
    }
}