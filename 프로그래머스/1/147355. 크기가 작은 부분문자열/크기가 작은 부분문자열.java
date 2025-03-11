class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for (int i=0; i<=t.length()-p.length(); i++) {
            Long n = Long.parseLong(t.substring(i,i+p.length()));  // subString(i, k)는 i부터 k-1까지만 가져옴
            
            if (n<=Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}