class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        List<Integer> cols = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0) {
                    rows.add(j);
                    cols.add(i);
                }
            }
        }

        for(int j : rows){
            for(int i = 0; i < n; i++){
                matrix[i][j] = 0;
            }
        }

        for(int i : cols){
            for(int j = 0; j < m; j++){
                matrix[i][j] = 0;
            }
        }
        
    }
}