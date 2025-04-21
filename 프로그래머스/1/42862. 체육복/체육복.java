import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int borrow = 0;
        List<Integer> reserveList = new ArrayList<>();
        Set<Integer> lostSet = new HashSet<>();

        for (int i : reserve) {
            reserveList.add(i);
        }

        for (int i : lost) {
            if (reserveList.contains(i)) {
                borrow++;
                reserveList.remove((Integer) i);
            } else {
                lostSet.add(i);
            }
        }

        for (int i : lostSet) {
            if (reserveList.contains(i - 1)) {
                borrow++;
                reserveList.remove((Integer)(i - 1));
            } else if (reserveList.contains(i + 1)) {
                borrow++;
                reserveList.remove((Integer)(i + 1));
            }
        }

        answer = n - (lost.length - borrow);
        
        return answer;
    }
}