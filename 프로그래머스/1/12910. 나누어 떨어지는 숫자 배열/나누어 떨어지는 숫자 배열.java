import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List<Integer> answerList = new ArrayList<>();
        
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%divisor == 0) {
                answerList.add(arr[i]);
            }
        }
        
        if (answerList.size() == 0) {
            answerList.add(-1);
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}