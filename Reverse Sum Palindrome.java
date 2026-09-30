class Solution {
    static int isSumPalindrome(int n) {
        int temp = n; 
        int rev = 0;
        while(temp > 0){
            int d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }
        if(rev == n) return n;
        for(int i = 0; i < 5;i++){
            temp = n; 
            rev = 0;
            while(temp > 0){
                int d = temp % 10;
                rev = rev * 10 + d;
                temp /= 10;
            }
            n = n + rev;
            temp = n; 
            rev = 0;
            while(temp > 0){
                int d = temp % 10;
                rev = rev * 10 + d;
                temp /= 10;
            }
            if(rev == n) return n;
        }
        return -1;
    }
}
