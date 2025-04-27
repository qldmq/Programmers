import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        List<Integer> answerList = new ArrayList<>();
        int math1[] = {1,2,3,4,5};
        int math2[] = {2, 1, 2, 3, 2, 4, 2, 5};
        int math3[] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        for (int i=0; i<answers.length; i++) {
            if (math1[i%5] == answers[i]) {
               cnt1++; 
            }
            if (math2[i%8] == answers[i]) {
               cnt2++; 
            }
            if (math3[i%10] == answers[i]) {
               cnt3++; 
            }
        }
        
        if (cnt1>=cnt2 && cnt1>=cnt3) {
            answerList.add(1);
        }
        if (cnt2>=cnt1 && cnt2>=cnt3) {
            answerList.add(2);
        }
        if (cnt3>=cnt1 && cnt3>=cnt2) {
            answerList.add(3);
        }
        
        int[] answer = new int[answerList.size()];
        
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}