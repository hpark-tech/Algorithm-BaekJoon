import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        List<Integer> arraySort = new ArrayList<>();
        int resultNum=0;
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<commands.length; i++){    
    for(int j=commands[i][0]; j<commands[i][1]+1; j++){
        arraySort.add(array[j-1]);
    }
            Collections.sort(arraySort);
            resultNum=arraySort.get(commands[i][2]-1);   
            answer.add(resultNum);
            arraySort.clear();
            } 
        
    int[] answerArray = new int[answer.size()];
    for(int k=0; k<answer.size();k++){
        answerArray[k]=answer.get(k);
    }
        return answerArray;
    }
}