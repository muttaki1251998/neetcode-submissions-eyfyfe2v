class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        HashMap<Character, Integer> freq = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            int maxFreq = Collections.max(freq.values());

            while((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
                maxFreq = Collections.max(freq.values());
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
