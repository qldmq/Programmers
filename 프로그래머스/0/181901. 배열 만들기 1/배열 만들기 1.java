import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> aryList = new ArrayList<>();
        
        for (int i=1; i<=n; i++) {
            if (i%k==0) {
                aryList.add(i);
            }
        }
        
        int[] answer = new int[aryList.size()];
        
        for (int i=0; i<aryList.size(); i++) {
            answer[i] = aryList.get(i);
        }
        
        return answer;
    }
}