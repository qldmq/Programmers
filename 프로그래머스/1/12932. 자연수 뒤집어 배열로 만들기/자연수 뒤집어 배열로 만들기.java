class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int j = 0;
        
        for (int i=answer.length-1; i>=0; i--) {
            answer[j] = s.charAt(i) - '0';
            j++;
        }
        
        return answer;
    }
}