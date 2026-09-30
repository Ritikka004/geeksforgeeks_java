class Solution {
    public int solve(int b, List<Integer> arr) {
        for(int i = 0; i < arr.size();i++){
            if(arr.get(i) == b){
                b = b * 2;
            }
        }
        return b;
    }
}
