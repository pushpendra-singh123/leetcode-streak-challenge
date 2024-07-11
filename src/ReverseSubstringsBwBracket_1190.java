import java.util.Stack;

public class ReverseSubstringsBwBracket_1190 {
    public static String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(curr);
                curr = new StringBuilder();
            } else if (c == ')') {
                curr.reverse();
                curr = st.pop().append(curr);
            } else {
                curr.append(c);
            }

        }
        return curr.toString();
    }

    public static void main(String[] args) {

    }
}
