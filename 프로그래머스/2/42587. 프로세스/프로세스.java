import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> que = new LinkedList<>();
        
        for (int i=0; i<priorities.length; i++) {
            que.offer(new int[] {i, priorities[i]});
        }
        
        while (!que.isEmpty()) {
            int current[] = que.poll();
            boolean check = false;
            
            for (int q[] : que) {
                if (current[1] < q[1]) {
                    check = true;
                    break;
                }
            }
            
            if (check) {
                que.offer(current);
            } else {
                answer++;
                if (current[0] == location) {
                    break;
                }
            }
        }
        
        return answer;
    }
}