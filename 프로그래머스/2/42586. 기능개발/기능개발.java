import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> aryList = new ArrayList<>();
        int num = 0;
        
        while (num < progresses.length) {
            int localCnt = 0;
            
            for (int i=num; i<progresses.length; i++) {
                progresses[i] += speeds[i];
            }

            while(num < progresses.length && progresses[num] >= 100) {
                num++;
                localCnt++;
            }
            
            if (localCnt > 0) {
                aryList.add(localCnt);
            }
        }
        
        int[] answer = new int[aryList.size()];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = aryList.get(i);
        }
        
        return answer;
    }
}