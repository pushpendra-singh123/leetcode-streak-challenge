package strings;
public class MaxScoreRemovingSubString_1717 {
//    x : "ab" , y : "ba"
    char str[];
    public int removeSubstring(String pair, int score) {
        int totalScore = 0;
        char firstTargetChar = pair.charAt(0);
        char secTargetChar = pair.charAt(1);
        int writeIndex = 0;
        for (int readIndex=0;str[readIndex] != '$';readIndex++){
            str[writeIndex] = str[readIndex];
            writeIndex++;
            if (writeIndex > 1){
                char firstChar = str[writeIndex - 2];
                char secChar = str[writeIndex - 1];
                if (firstChar == firstTargetChar && secChar == secTargetChar){
                    writeIndex -=2;
                    totalScore += score;
                }
            }
        }

        str[writeIndex] = '$';
        return totalScore;
    }
    public int maximumGain(String s, int x, int y) {
        int n = s.length();
        str = new char[n+1];
        for (int i = 0; i < n; i++) {
            str[i] = s.charAt(i);
        }
        str[n] = '$';
        String firstPair = (x>y)?"ba":"ab";
        String secPair = (firstPair.equals("ab"))?"ab":"ba";
        int score = 0;
        score = removeSubstring(firstPair,Math.max(x,y));
        System.out.println(str);
        score += removeSubstring(secPair,Math.min(x,y));
        return score;
    }
}