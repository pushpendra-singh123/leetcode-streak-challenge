package strings;

//Example 1:
//
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
//Example 2:
//
//Input: words = ["cool","lock","cook"]
//Output: ["c","o"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacter_1002 {
    static List<String> commonChars(String[] A) {
        List<String> common_chars = new ArrayList<>();
        int[] min_frequencies = new int[26];
        Arrays.fill(min_frequencies, Integer.MAX_VALUE);
        for (String current_string : A) {
            int[] char_frequency = new int[26];
            for (char c : current_string.toCharArray()) {
                char_frequency[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (min_frequencies[i] > 0) {
                common_chars.add("" + (char) (i + 'a'));
                min_frequencies[i]--;
            }
        }
        return common_chars;
    }

    // best and easy solution copying from leetcode
    public List<String> commonChars2(String[] words) {

        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);
        for (String word : words) {
            int[] cnt = new int[26];
            for (char c : word.toCharArray()) {
                cnt[c - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                common[i] = Math.min(common[i], cnt[i]);
            }
        }
        List<String> ans = new ArrayList();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < common[i]; j++) {
                ans.add("" + (char) ('a' + i));
            }
        }
        return ans;

    }
}