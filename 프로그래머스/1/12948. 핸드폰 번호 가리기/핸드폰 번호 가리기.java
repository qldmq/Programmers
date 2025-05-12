class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        
        for (int i=0; i<len-4; i++) {
            answer += '*';
        }
        for (int i=4; i>=1; i--) {
            answer += phone_number.charAt(len-i);
        }
        
        return answer;
    }
}