class Solution {
    public void swapKth(List<Integer> arr, int k) {
        int l = k - 1;
        int r = arr.size() - k;
        int temp = arr.get(l);
        arr.set(l, arr.get(r));
        arr.set(r, temp);
    }
}
