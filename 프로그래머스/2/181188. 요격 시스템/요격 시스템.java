import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[][] targets) {
        Arrays.sort(targets, Comparator.comparingInt(a -> a[1]));
        
        int answer = 0;
        int last = -1;  // 마지막으로 요격한 시간
        
        for (int target[] : targets) {
            if (target[0] >= last) {
                answer++;
                last = target[1];
            }
        }
            
        return answer;
    }
}