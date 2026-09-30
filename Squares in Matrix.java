class Solution {
    public int squaresInMatrix(int m, int n) {
        int a = Math.min(m,n);
        int b = Math.max(m,n);
        return a * (a + 1) * (3 * b - a + 1) / 6;
    }
};
