class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            int maxFreq = Collections.max(freq.values());
            
            // While window needs to slide. Need more than K
            // items to replace for same characters
            while((right - left + 1) - maxFreq > k) {
                char leftc = s.charAt(left);
                // remove from freq count
                freq.put(leftc, freq.get(leftc) - 1);
                // move the subarray slider
                left++;
                // recalculate freq count
                maxFreq = Collections.max(freq.values());
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
