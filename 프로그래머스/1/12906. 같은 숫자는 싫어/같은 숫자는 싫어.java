import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i:arr){if(stack.isEmpty()||stack.peek()!=i){stack.push(i);}}
        int []answer = new int[stack.size()];
        int cnt=0;
        for(int i=0;i<answer.length;i++){answer[cnt++]=stack.pollLast();}
        return answer;
    }
}