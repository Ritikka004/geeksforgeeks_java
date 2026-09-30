class Solution {
    boolean isDigitSumPalindrome(int n) {
        int sum = 0;
        while(n > 0){
            int d  = n % 10;
            sum += d;
            n /= 10;
        }
        int temp = sum;
        int rev = 0;
        while(temp > 0){
            int d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }
        return sum == rev;
    }
}
