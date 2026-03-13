class Solution {
    public int minDiff(int[] arr) {
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            diff = Math.min(diff,arr[i] - arr[i-1]); 
        }
        return diff;
    }
}
