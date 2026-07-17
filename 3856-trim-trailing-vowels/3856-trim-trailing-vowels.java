class Solution {
    public String trimTrailingVowels(String s) {
        int count = 0;
        int n = s.length();
        String vowels = "aeiou";
        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            if(vowels.indexOf(ch) != -1) count++;    //mtlb bo vowels string me present hai --> agr present nhi hota hai toh -1 dega
            // if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')  count++;
            else break;
        }
        return s.substring(0,n-count);
    }
}