import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String lowerAnswer = my_string.toLowerCase();
            char[] charAnswer =lowerAnswer.toCharArray();
         Arrays.sort(charAnswer);
        String answer = "";
        answer = String.valueOf(charAnswer);
        return answer;
    }
}