class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            if(!set.contains(i)){
                set.add(i);
                list.add(i);
            }
        }
        return list;
    }
}
