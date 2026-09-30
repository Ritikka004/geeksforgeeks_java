class Solution {
    public int countDistinct(int arr[]) {
        HashSet<Integer>set = new HashSet<>();
        int count = 0;
        for(int i : arr){
            if(!set.contains(i)){
                set.add(i);
                count++;
            }
        }
        return count;
    }
}
