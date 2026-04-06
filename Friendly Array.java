class Solution {
    public int calculateFriendliness(int[] arr) {
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            ans += Math.abs(arr[i] - arr[(i+1)%n]);
        }
        return ans;
    }
}
