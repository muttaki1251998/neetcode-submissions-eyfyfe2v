class Solution {
    public boolean canFinish(int[] piles, int eatingRate, int h) {
        int hours = 0;
        for(int pile : piles) {
            hours += (pile + eatingRate - 1) / eatingRate;
        }
        return hours <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int pile : piles) {
            right = Math.max(right, pile);
        }
        while(left < right) {
            int mid = left + (right-left) / 2;
            if(canFinish(piles, mid, h)){
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
