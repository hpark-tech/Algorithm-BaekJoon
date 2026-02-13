import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {      
    int[] result = new int[commands.length];
    for(int i=0; i<commands.length; i++){    
    int[] innerArray = new int[3];
        for(int j=0; j<3; j++){
        innerArray[j] = commands[i][j];
             }
        int[] innerArrayCopy = Arrays.copyOfRange(array, innerArray[0]-1, innerArray[1]);
        Arrays.sort(innerArrayCopy);
        int resultNum = innerArrayCopy[innerArray[2]-1];
                    result[i] = resultNum; 
                }     
        
        return result;
    }
}