class Solution {
    public static void countOddEven(Integer arr[]) {
        int odd_count = 0;
        int even_count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                odd_count++;
            }else{
                even_count++;
            }
        }
        System.out.println(odd_count+ " " + even_count);
    }
}
