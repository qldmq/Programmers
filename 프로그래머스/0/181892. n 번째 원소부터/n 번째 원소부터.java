import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> aryList = new ArrayList<>();
        
        for (int i=n-1; i<num_list.length; i++) {
            aryList.add(num_list[i]);
        }
        
        int[] answer = new int[aryList.size()];
        
        for (int i=0; i<aryList.size(); i++) {
            answer[i] = aryList.get(i);
        }
        
        return answer;
    }
}