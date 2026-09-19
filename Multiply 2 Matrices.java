class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        int n = a.length;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < n;j++){
                int sum = 0;
                for(int k = 0; k < n;k++){
                    sum += a[i][k] * b[k][j];
                }
                row.add(sum);
            }
            list.add(row);
        }
        return list;
    }
}
