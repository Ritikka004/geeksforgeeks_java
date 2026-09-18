class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i : arr){
            if(i >= 0){
                positive.add(i);
            }else{
                negative.add(i);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int  i = 0, j = 0;
        while(i < positive.size() && j < negative.size()){
            result.add(positive.get(i++));
            result.add(negative.get(j++));
        }
        while(i < positive.size() ){
            result.add(positive.get(i++));
        }
        while(j < negative.size() ){
            result.add(negative.get(j++));
        }
        return result;
    }
}
