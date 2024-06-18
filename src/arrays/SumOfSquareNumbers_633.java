package arrays;
// Two pointer approach by shashCode.
public class SumOfSquareNumbers_633 {
    public static boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);
            while (a<=b){
                long t = a*a + b*b;
                if (t == c){
                    return true;
                } else if (t < c) {
                    a++;
                }else {
                    b--;
                }
            }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
    }
}
