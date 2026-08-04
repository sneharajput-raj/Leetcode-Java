class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num < min) min = num;
            if(num > max) max = num;
            set.add(num);
        }
        for(int i=min; i<=max; i++){
            if(!set.contains(i)) li.add(i);
        }
        return li;
    }
}