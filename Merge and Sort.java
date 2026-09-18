class Solution {
    public ArrayList<Integer> mergeNsort(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        for(int num : arr1){
            set.add(num);
        }for(int num : arr2){
            set.add(num);
        }
        for(int num : set){
            list.add(num);
        }
        return list;
    }
}
