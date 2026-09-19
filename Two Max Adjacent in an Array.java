class Solution {
    public int maxAdjSum(int[] arr) {
        int sum = 0, max = 0;
        for(int i = 0;i < arr.length - 1;i++){
            sum = arr[i] + arr[i + 1];
            max = Math.max(max,sum);
        } 
        return max;
    }
}
