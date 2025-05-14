import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> aryList = new ArrayList<>();
        
        for (int i=0; i<k && i<score.length; i++) {
            aryList.add(score[i]);
            
            answer[i] = Collections.min(aryList);
        }
        
        for (int i=k; i<score.length; i++) {
            int min = Collections.min(aryList);
            if (score[i] > min) {
                aryList.add(score[i]);
                aryList.remove(Integer.valueOf(min));
                answer[i] = Collections.min(aryList);
            } else {
                answer[i] = min;
            }
        }
        
        return answer;
    }
}