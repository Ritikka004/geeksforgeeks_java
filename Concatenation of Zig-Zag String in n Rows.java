class Solution {
    public String convert(String s, int n) {
        if(n == 1 || s.length() <= n) return s;
        StringBuilder arr[] = new StringBuilder[n];
        for(int i = 0; i < n;i++){
            arr[i] = new StringBuilder();
        }
        int cr = 0;
        int direction = 1;
        for(char c : s.toCharArray()){
            arr[cr].append(c);
            if(cr == 0){
                direction = 1;
            }else if(cr == n - 1){
                direction = -1;
            }
            cr += direction;
        }
        StringBuilder y = new StringBuilder();
        for(StringBuilder a : arr){
            y.append(a);
        }
        return y.toString();
    }
};
