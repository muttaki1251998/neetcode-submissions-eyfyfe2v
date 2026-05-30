class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlen = 0;
        Set<Integer> sequence = new HashSet<>();

        for(int num : nums) {
            sequence.add(num);
        }

        for(int num : nums) {
           if(!sequence.contains(num-1)) {
                int streak = 0;
                int curr = num;
                while(sequence.contains(curr)) {
                    streak++;
                    curr++;
                }
                maxlen = Math.max(maxlen, streak);
           } 
        }
        return maxlen;
    }
}
