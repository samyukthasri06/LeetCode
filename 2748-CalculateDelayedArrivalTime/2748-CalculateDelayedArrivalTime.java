// Last updated: 7/17/2026, 3:14:19 PM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime+delayedTime)%24;
    }
}