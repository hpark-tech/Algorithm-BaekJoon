import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int max = nums.length/2;
        HashSet<Integer> typeHS = new HashSet<>();
        for(int i : nums){typeHS.add(i);}
        int type = typeHS.size();
        int answer = 0;
        return Math.min(max,type);
    }
}