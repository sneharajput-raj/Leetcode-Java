class Solution {
    public int[] scoreValidator(String[] events) {
        int n = events.length;
        int score = 0;
        int counter = 0;
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            String curr = events[i];
            if(curr.equals("W")){
                counter++;
                if(counter == 10){
                    break;
                }
            }
            else if(curr.equals("6")) score +=6;
            else if(curr.equals("4")) score +=4;
            else if(curr.equals("3")) score +=3;
            else if(curr.equals("2")) score +=2;
            else if(curr.equals("1")) score +=1;
            else if(curr.equals("0")){
                continue;
            }
            else score++;            //'WD' & 'NB'   +1
        }
        ans[0] = score;
        ans[1] = counter;
        return ans;
    }
}