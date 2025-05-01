import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> answerList = new ArrayList<>();
        
        for (int i=0; i<names.length; i+=5) {
            answerList.add(names[i]);
        }
        
        String[] answer = new String[answerList.size()];
        
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}