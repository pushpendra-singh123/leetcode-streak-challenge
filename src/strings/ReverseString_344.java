package strings;

public class ReverseString_344 {
    public static void reverseString(char[] s) {
        int start =0;
        int end = s.length -1;
        while(start<end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};
        reverseString(arr);
        for (char c : arr){
            System.out.print(c);
        }
    }
}
