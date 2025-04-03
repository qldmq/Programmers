class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for (int i=0; i<s.length(); i++) {
            answer[i] = -1;
        }
        
        for (int i=0; i<s.length(); i++) {
            int cnt = 0;
            char c = s.charAt(i);
            
            for (int j=i-1; j>=0; j--) {
                cnt++;
                if (s.charAt(j) == c) {
                    answer[i] = cnt;
                    break;
                }
            }
        }
        
        return answer;
    }
}