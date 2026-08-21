class Solution {
    public int distinctPrimeFactors(int[] nums) {
        //har ele ka prime factor nikalo unhe set me add(unique ke liye) or return set ka size
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            //kisi bi number (n) ka prime factor hamesha underRoot n ke andar mil jata hai
            for(int i=2; i*i <= n; i++){  //find prime factors upto sqrt(n)
                if(n % i == 0){
                    set.add(i);
                    while(n % i == 0){
                        n = n/i;
                    }
                }
            }
            if(n > 1){  //if n is still greater the remaining part is prime
                set.add(n);
            }
        }
        return set.size();
    }
}