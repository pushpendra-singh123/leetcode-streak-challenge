public class PassThePillow_2582 {
//    public static void passThePillow(int n, int time) {
//        int t = 1, t1 =2;
//        ArrayList<Integer> arr = new ArrayList<>();
//        for (int i = 1; i < time+2; i++) {
//            if (i<n){
//                arr.add(t);
//                t++;
//            }
//
//            else {
//                if (n < 1){
//                    arr.add(t1);
//                    t1++;
//                }else {
//                    arr.add(n);
//                    n--;
//                }
//            }
//        }
//        System.out.println(arr);
//        System.out.println(arr.getLast());
//    }


//    By  shashCode
    public static int passThePillow(int n, int time){
//        int pillowPosition = 1;
//        int currTime = 0;
//        boolean revDir = false;
//        while (currTime < time){
//            if (!revDir){
//                pillowPosition++;
//            }else {
//                pillowPosition--;
//            }
//            if (pillowPosition == 1 || pillowPosition == n){
//                revDir = !revDir;
//            }
//            currTime++;
//        }
//        return pillowPosition;



        // optimized solution
        int totalRounds = time/(n-1);
        boolean revDir = totalRounds %2 !=0;
        if (revDir){
            return n-(time%(n-1));
        }else {
            return time % (n-1)+1;
        }
    }
    public static void main(String[] args) {
        passThePillow(2,238);
    }
}


// Optimized code copied.

//class Solution {
//    public int passThePillow(int n, int time) {
//        time %= ((n-1)*2);
//        if(time < n) return time + 1;
//        time -= n;
//        return n-time - 1;
//    }
//}