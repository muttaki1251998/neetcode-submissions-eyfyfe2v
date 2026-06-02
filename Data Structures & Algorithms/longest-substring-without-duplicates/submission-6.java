class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> set = new HashSet<>();
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while(set.contains(c)) {
                char leftc = s.charAt(left);
                set.remove(leftc);
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, set.size());
        }
        return maxLen;
    }
}
