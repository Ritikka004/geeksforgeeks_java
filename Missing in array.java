class Solution {
    int missingNum(int arr[]) {
        int xor = 0;
        for(int i = 0; i < arr.length; i++)
            xor ^= arr[i];
        for(int i = 1; i <= arr.length + 1; i++)
            xor ^= i;
        return xor;
    }
}
