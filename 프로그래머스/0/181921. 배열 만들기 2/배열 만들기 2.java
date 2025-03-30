import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        
        ArrayList<Integer> aryList = new ArrayList<>();

        for (int i=l; i<=r; i++) {
            
            boolean check = false;
            String s = Integer.toString(i);
            int len = s.length();
            
            for (int j=0; j<len; j++) {
                if (s.charAt(j)!='5' && s.charAt(j)!='0') {
                    check = false;
                    break;
                } else {
                    check = true;
                }
            }
            
            if (check) {
                aryList.add(i);
            }
        }
        
        if (aryList.isEmpty()) {
            aryList.add(-1);
        }
        
        int[] answer = new int[aryList.size()];
            for (int i=0; i<aryList.size(); i++) {
                answer[i] = aryList.get(i);
            }
        
        return answer;
    }
}