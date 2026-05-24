class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int right=0; right<s.length(); right++) {
            char c = s.charAt(right);
            // Map frequency
            map.put(c, map.getOrDefault(c, 0) + 1);
            int maxFreq = Collections.max(map.values());
            while((right-left+1) - maxFreq > k) {
                char leftc = s.charAt(left);
                map.put(leftc, map.get(leftc) - 1);
                left++;
                maxFreq = Collections.max(map.values());
            }
            maxLen = Math.max(maxLen, (right-left)+1);
        }
        return maxLen;
    }
}
