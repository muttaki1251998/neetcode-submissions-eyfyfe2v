class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen = 0;
        Set<Integer> sequence = new HashSet<>(nums.length);
        for(int num : nums) {
            sequence.add(num);
        }

        for(int num : nums) {
            if(!sequence.contains(num-1)) {
                int streak = 0;
                int currIndexer = num;
                while(sequence.contains(currIndexer)) {
                    streak++;
                    currIndexer++;
                }
                maxLen = Math.max(streak, maxLen);
            }
        }
        return maxLen;
    }
}
