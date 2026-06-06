class Solution {
    public boolean isSelfDividing(int x){
        int copy = x;
        while(x > 0){
           int rem = x % 10;
           if(rem == 0 || copy % rem != 0) return false;
           x = x/10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(isSelfDividing(i)) li.add(i);
        }
        return li;
    }
}