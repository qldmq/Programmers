class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        
        if (len%2 == 0) {
            for (int i=len/2; i<=(len/2)+1; i++) {
                answer += s.charAt(i-1);
            }
        } else {
            answer += s.charAt(len/2);
        }
        
        return answer;
    }
}