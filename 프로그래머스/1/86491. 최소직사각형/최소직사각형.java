import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
    
        for (int i=0; i<sizes.length; i++) {
            Arrays.sort(sizes[i]);
            int mi = sizes[i][0];
            int ma = sizes[i][1];
            
            if (mi > min) {
                min = mi;
            }
            if (ma > max) {
                max = ma;
            }
        }
        answer = min * max;
        
        return answer;
    }
}