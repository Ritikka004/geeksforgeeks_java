class Solution {
    public int getSecondLargest(int[] arr) {
        int large = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > large){
                seclarge = large;
                large = arr[i];
            }else if(arr[i] > seclarge && arr[i]!= large){
                seclarge = arr[i];
            }
        }
        if(seclarge == Integer.MIN_VALUE){
            return -1;
        }
        return seclarge;
    }
}
