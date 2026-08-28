class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int totalTime = 0;
        int curr = 0;
        for(int i=0; i<requests.length; i++){
            totalTime = totalTime + Math.abs(requests[i] - curr);
            curr = requests[i];
        }
        return totalTime;
    }
}