class Solution {
    public int countZeros(int[][] mat) {
        int n = mat.length;
        int row = 0;
        int col = n - 1;
        int count = 0;
        while(row < n && col >= 0){
            if(mat[row][col] == 0){
                count += col + 1;
                row++;
            }else{
                col--;
            }
        }
        return count;
    }
};
