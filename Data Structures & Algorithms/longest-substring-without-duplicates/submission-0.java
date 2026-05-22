class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int maxLength = 0;
            
        for(int right = 0; right < s.length(); right++) {
            while(seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            if(seen.size() > maxLength) {
                    maxLength = seen.size();
            }
        }
         return maxLength;
    }
}
