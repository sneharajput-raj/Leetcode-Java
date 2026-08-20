class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2; i<n; i++){
            int lastArr1 = arr1.get(arr1.size()-1);
            int lastArr2 = arr2.get(arr2.size()-1);
            if(lastArr1 > lastArr2){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int[] res = new int[n];
        int idx = 0;
        for(int ele : arr1){
            res[idx++] = ele;
        }
        for(int ele : arr2){
            res[idx++] = ele;
        }
        return res;
    }
}