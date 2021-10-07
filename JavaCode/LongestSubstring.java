//Longest Substring Without Repeating Characters <https://leetcode.com/problems/longest-substring-without-repeating-characters/>
//Given a string s, find the length of the longest substring without repeating characters.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0)
            return 0;

        int len = 0, maxVal = Integer.MIN_VALUE;

        Set<Character> hs = new HashSet<Character>();

        for(int i=0; i<s.length(); i++){

            maxVal = Math.max(maxVal, hs.size());

            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(len));
                len++;
            }
            hs.add(s.charAt(i));
        }
        maxVal = Math.max(maxVal, hs.size());
        return maxVal;
    }
}
