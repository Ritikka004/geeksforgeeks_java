class Solution {
    public int searchInsertK(int arr[], int k) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(arr[mid] == k){
                return mid;
            }else if(arr[mid] < k){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return l;
    }
}
