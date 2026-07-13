class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() -1;
        while(low <= high){
            if(Character.isLetterOrDigit(s.charAt(low)) == false) low++;  //low valid character nhi h toh low ko badhao
            else if(Character.isLetterOrDigit(s.charAt(high)) == false) high--;   //high valid nhi toh high ko kmm
            else{   //dono valid hue toh , dono ko compare karo or move kro
                if(Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) return false;
                low++;
                high--;
            }
        }
        return true;
    }
}