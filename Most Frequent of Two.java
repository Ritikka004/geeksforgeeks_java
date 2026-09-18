class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
       int countx = 0, county = 0;
       for(int i : arr){
           if(i == x) countx++;
           if(i == y) county++;
       }
       if(countx > county){
           return x;
       }else if(county > countx){
           return y;
       }else{
           return Math.min(x,y);
       }
    }
}
