import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = String.valueOf(n);
        Integer ary[] = new Integer[s.length()];
        
        for (int i=0; i<ary.length; i++) {
            char c = s.charAt(i);
            ary[i] = c - '0';
        }
        
        Arrays.sort(ary, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for (int array : ary) {
            sb.append(array);
        }
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}