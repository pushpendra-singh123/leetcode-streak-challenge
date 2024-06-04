package strings;

import java.util.Scanner;

public class ReverseString_344 {
    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        char[] arr = new char[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
        }
        reverseString(arr);
        for (char c : arr) {
            System.out.print(c);
        }
    }
}
