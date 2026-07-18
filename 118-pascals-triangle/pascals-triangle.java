class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();   

        for(int i = 0; i < numRows; i++){
            List<Integer> cols = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j > 0 && j < i && i > 0){
                    // System.out.println(i + " " + j);
                    cols.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }else{
                    cols.add(1);
                }
            }
            ans.add(cols);
        }
        return ans;
    }
}