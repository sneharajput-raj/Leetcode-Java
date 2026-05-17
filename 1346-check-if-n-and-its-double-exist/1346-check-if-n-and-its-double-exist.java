class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for(int ele : arr){
            if(set.contains(2*ele)){
                return true;
            }
            if(ele % 2 == 0 && set.contains(ele/2)){
                return true;
            }
            set.add(ele);
        }
        return false;
    }
}