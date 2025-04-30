import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int n = maps.length;
        int m = maps[0].length;
        
        int dx[] = {1, -1, 0, 0};
        int dy[] = {0, 0, 1, -1};
        
        int distance[][] = new int[n][m];
        boolean visited[][] = new boolean[n][m];
        
        Queue<Point> que = new LinkedList<>();
        
        que.offer(new Point(0, 0));
        visited[0][0] = true;
        distance[0][0] = 1;
        
        while (!que.isEmpty()) {
            Point p = que.poll();
            if (p.x==n-1 && p.y==m-1) {
                answer = distance[n-1][m-1];
                return answer;
            }
            
            for (int i=0; i<4; i++) {
                int xx = p.x + dx[i];
                int yy = p.y + dy[i];
                if (xx>=0 && yy>=0 && xx<n && yy<m) {
                    if (maps[xx][yy]==1 && !visited[xx][yy]) {
                        que.offer(new Point(xx, yy));
                        visited[xx][yy] = true;
                        distance[xx][yy] = distance[p.x][p.y] + 1;
                    }
                }
            }
        }
        
        return -1;
    }
}

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}