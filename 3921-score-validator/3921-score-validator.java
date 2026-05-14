class Solution {
    public int[] scoreValidator(String[] events) {
        int n = events.length;
        int score = 0;
        int counter = 0;
        int[] result = new int[2];
        for(int i=0; i<n; i++){
            String curr = events[i];
            if(curr.equals("W")){
                counter++;
                if(counter == 10){
                    break;
                }
            }
            else if(curr.equals("1")){
                score = score + 1;
            }
            else if(curr.equals("2")){
                score = score + 2;
            }
            else if(curr.equals("3")){
                score = score + 3;
            }
            else if(curr.equals("4")){
                score = score + 4;
            }
            else if(curr.equals("6")){
                score = score + 6;
            }
            else if(curr.equals("0")){
                continue;
            }
            else{
                score++;
            }
        }
        result[0] = score;
        result[1] = counter;
        return result;
    }
}