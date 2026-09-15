class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);   //hr row ka first element (1)
    
            for(int j=1; j<i; j++){     //beech ke elements
                int value = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                row.add(value);
            }
            if(i > 0){      //har row ka last element (1)
                row.add(1);
            }
            ans.add(row);
        }
        return ans;
    }
}