import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> aryList = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (aryList.isEmpty()) {
                aryList.add(arr[i]);
                i++;
            } else if (aryList.get(aryList.size()-1) < arr[i]) {
                aryList.add(arr[i]);
                i++;
            } else {
                aryList.remove(aryList.get(aryList.size()-1));   // pop()은 스택에서 사용
            }
        }
        
        int[] stk = new int[aryList.size()];
        
        for (int j=0; j<stk.length; j++) {
            stk[j] = aryList.get(j);
        }
        
        return stk;
    }
}