import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        Set<String> wordSet = new HashSet<>();
        wordSet.add(words[0]);
        
        for (int i=1; i<words.length; i++) {
            String end = words[i - 1];
            String start = words[i];
            
            if (start.charAt(0) != end.charAt(end.length() - 1)) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                return answer;
            }
            
            if (wordSet.contains(start)) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                return answer;
            }
            wordSet.add(start);
        }
        answer[0] = 0;
        answer[1] = 0;
        
        return answer;
    }
}