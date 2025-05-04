import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> answerList = new ArrayList<>();
        
        int num = arr[0];
        answerList.add(num);

        for (int i=1; i<arr.length; i++) {
            if (num == arr[i]) {
                continue;
            } else {
                num = arr[i];
                answerList.add(num);
            }
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}