class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length-1;
        String vowels = "aeiouAEIOU";

        while(low < high){
            //jo vowels string me nhi h uska index -1(means consonents ka)
            //move low pointer until it points to vowel
            while(low < high && vowels.indexOf(arr[low]) == -1){
                low++;
            }
            //move high pointer until it points to vowel
            while(low < high && vowels.indexOf(arr[high]) == -1){
                high--;
            }
            //swap vowels
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return new String(arr);
    }
}