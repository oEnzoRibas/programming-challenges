package LC3_Longest_Substring_Without_Repeating_Characters;

/*
Given a string s, find the length of the longest
substring
 without repeating characters.

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 10^4
s consists of English letters, digits, symbols and spaces.
 */

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int pointer_a = 0;
        int pointer_b = 0;
        int max = 0;

        HashSet<Character> hash_set = new HashSet<>();

        while(pointer_b < s.length()){
            if (!hash_set.contains(s.charAt(pointer_b))){
                hash_set.add(s.charAt(pointer_b));
                pointer_b++;
                max = Math.max(hash_set.size(),max);
            }else{
                hash_set.remove(s.charAt(pointer_a));
                pointer_a++;
            }
        }
        String reversed = s.substring(pointer_a,pointer_b);

        return max;
    }
}
