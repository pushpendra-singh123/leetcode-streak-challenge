package strings;

//Input: s = "abccccdd"
//Output: 7
//Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.

public class LongestPalindrome_409 {
//    public static int longestPalindrome(String s) {
        // check palindrome and returns their length.
//        if (s.length() == 1 || s.length() == 2){    // no need to check palindrome.
//            return s.length();
//        }
//        int l = s.length()-1;
//        for (int i = 0; i < s.length(); i++){
//            if (s.charAt(i) == s.charAt(l)){
//
//            }
//
//
//            l++;
//        }
//
//        return s.length();
//    }


    public static int longestPalindrome(String s) { // by coding sphere (on yt)
        int[] count = new int[128]; // 0 to 127
        for (char ch: s.toCharArray())
            count[ch]++;
        int result = 0;
        for (int i = 0; i < 128; i++) {
            int val = count[i];
            result = result + (val/2)*2;
            if (result % 2==0 && val %2 ==1){
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcabcabc"));
    }
}
