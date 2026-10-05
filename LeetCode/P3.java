import java.util.Set;
import java.util.HashSet;

public class P3 {

    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int l = 0; //l = left
            int longest = 0;
            for(int r = 0; r < s.length(); r++){ // r = right
                char c = s.charAt(r);
                while(set.contains(c)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(c);
                int count = r - l + 1;
                longest = Math.max(longest, count);
            }
            return longest;
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
        String s5 = "abcdef";

        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s1));
        System.out.println("Expected: 3");
        System.out.println();

        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s2));
        System.out.println("Expected: 1");
        System.out.println();

        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s3));
        System.out.println("Expected: 3");
        System.out.println();

        System.out.println("Input: " + s4);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s4));
        System.out.println("Expected: 0");
        System.out.println();

        System.out.println("Input: " + s5);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s5));
        System.out.println("Expected: 6");
    }
}