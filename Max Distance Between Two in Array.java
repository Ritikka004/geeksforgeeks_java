class Solution {
    public int getCount(int[] arr, int x, int y) {
        int firstx  = -1, lastx  = -1;
        int firsty = -1, lasty = -1;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == x){
                if(firstx == -1){
                    firstx = i;
                }
                lastx = i;
            }if(arr[i] == y){
                if(firsty == -1){
                    firsty = i;
                }
                lasty = i;
            }
        }
        if(firstx == -1 || firsty == -1){
            return -1;
        }
        int dis1 = lasty - firstx - 1;
        int dis2 = firsty - lastx - 1;
        return Math.max(dis1,dis2);
    }
}
