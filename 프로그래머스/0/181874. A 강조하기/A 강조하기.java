class Solution {
    public String solution(String myString) {
        String answer = "";
        
        myString = myString.toLowerCase();
        
        for (int i=0; i<myString.length(); i++) {
            char c = myString.charAt(i);
                
            if (c == 'a') {
                answer += Character.toUpperCase(c);
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}