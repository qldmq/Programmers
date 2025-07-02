import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int n = nums.length/2;
        
        Set<Integer> key = new HashSet<>();
        
        for (int i : nums) {
            if (!key.contains(i)) {
                key.add(i);
            }
            
            answer = (key.size() < n) ? key.size() : n;
        }
        return answer;
    }
}