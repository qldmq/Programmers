import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int i : lost) {
            lostSet.add(i);
        }
        
        for (int i : reserve) {
            if (lostSet.contains(i)) {
                lostSet.remove(i);
            } else {
                reserveSet.add(i);
            }
        }

        for (int i : new HashSet<>(lostSet)) {
            if (reserveSet.contains(i-1)) {
                lostSet.remove(i);
                reserveSet.remove((Integer) (i-1));
            } else if (reserveSet.contains(i+1)) {
                lostSet.remove(i);
                reserveSet.remove((Integer) (i+1));
            }
        }
       
        int size = lostSet.size();
        answer = n - size;
        
        return answer;
    }
}