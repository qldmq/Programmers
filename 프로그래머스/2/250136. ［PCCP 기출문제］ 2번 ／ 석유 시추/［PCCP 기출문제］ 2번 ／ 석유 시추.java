import java.util.*;

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        int n = land.length;
        int m = land[0].length;
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        boolean[][] visited = new boolean[n][m];
        Map<Integer, Integer> oilMap = new HashMap<>();
        int groupNum = 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && land[i][j] == 1) {
                    int localCnt = 0;
                    Queue<int[]> queue = new LinkedList<>();
                    
                    queue.offer(new int[]{i, j});
                    visited[i][j] = true;
                    land[i][j] = groupNum;
                    localCnt++;

                    while (!queue.isEmpty()) {
                        int[] ary = queue.poll();
                        int x = ary[0];
                        int y = ary[1];

                        for (int k = 0; k < 4; k++) {
                            int xx = x + dx[k];
                            int yy = y + dy[k];

                            if (xx >= 0 && xx < n && yy >= 0 && yy < m) {
                                if (!visited[xx][yy] && land[xx][yy] == 1) {
                                    visited[xx][yy] = true;
                                    land[xx][yy] = groupNum;
                                    queue.offer(new int[]{xx, yy});
                                    localCnt++;
                                }
                            }
                        }
                    }

                    oilMap.put(groupNum, localCnt);
                    groupNum++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            Set<Integer> visitedGroup = new HashSet<>();
            int cnt = 0;
            
            for (int j = 0; j < n; j++) {
                int num = land[j][i];
                
                if (num > 1 && !visitedGroup.contains(num)) {
                    cnt += oilMap.get(num);
                    visitedGroup.add(num);
                }
            }
            answer = Math.max(answer, cnt);
        }

        
        return answer;
    }
}