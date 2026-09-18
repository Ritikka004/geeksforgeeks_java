class Solution {
    public String longest(String[] arr) {
        String max = arr[0];
        for(int i = 1;i < arr.length;i++){
            int n = arr[i].length();
            if(n > max.length()){
                max = arr[i];
            }
        }
        return max;
    }
}
