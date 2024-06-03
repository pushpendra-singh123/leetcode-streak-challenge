package strings;
// append character to string to make subsequence.

public class MakeSubsequence_2486 {
    public static int appendCharacters(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        int i = 0, j = 0;
        while (i<l1 && j<l2 ){
            if (s.charAt(i) == t.charAt(j)){
                j++;
            }
            i++;
        }
        return l2-j;
    }

    public static void main(String[] args) {
        System.out.print(appendCharacters("coching" , "coding"));
    }
}
