class Solution {
    public int findDuplicate(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num : arr){
            if(map.get(num) == k){
                min = Math.min(num,min);
            }
        }
        if(min == Integer.MAX_VALUE){
            min = -1;
        }
        return min;
    }
}
