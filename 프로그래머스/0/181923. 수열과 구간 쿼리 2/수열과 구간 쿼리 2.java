import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int answer[] = new int[queries.length];
        int cnt = 0;
        
        for (int query[] : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int temp = 1000001;
            
            for (int i=s; i<=e; i++) {
                if (arr[i]>k && arr[i]<temp) {
                    temp = arr[i];
                }
            }
            
            if (temp != 1000001) {
                answer[cnt] = temp;
            } else {
                answer[cnt] = -1;
            }
            cnt++;
        }
        
        return answer;
    }
}