class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        Set<Character> seen = new HashSet<>();

        for(int right = 0; right < s.length(); right++) {
            // remove characters from set until duplicate is removed
            while(seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            // check if set length is greater than manLen
            if(seen.size() > maxLen) {
                maxLen = seen.size();
            }
        }
        return maxLen;
    }
}
