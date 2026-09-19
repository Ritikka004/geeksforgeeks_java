class Solution {
    public void segregateElements(int[] arr) {
        int temp[] = new int [arr.length];
        int ind = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] >= 0){
                temp[ind++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < 0){
                temp[ind++] = arr[i];
            }
        } 
        for(int i = 0; i < arr.length;i++){
            arr[i] = temp[i];
        }
    }
}
