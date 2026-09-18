class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int l = 0, r  = arr.length - 1;
        while(l < r){
            list.add(arr[r]);
            list.add(arr[l]);
            l++;
            r--;
        }
        if(l == r){
            list.add(arr[l]);
        }
        return list;
    }
}
