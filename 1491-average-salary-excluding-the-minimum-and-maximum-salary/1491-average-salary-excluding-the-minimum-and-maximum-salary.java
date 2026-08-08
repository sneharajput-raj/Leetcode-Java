class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<salary.length; i++){
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]); 
        }
        for(int i=0; i<salary.length; i++){
            if(salary[i] != min && salary[i] != max){
                sum = sum + salary[i];
                count++;
            }
        }
        return (double)sum/count;
    }
}