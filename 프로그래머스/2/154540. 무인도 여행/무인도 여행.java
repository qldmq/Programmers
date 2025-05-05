import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        boolean visited[][] = new boolean[maps.length][maps[0].length()];
        List<Integer> answerList = new ArrayList<>();
        
        for (int i=0; i<maps.length; i++) {
            for (int j=0; j<maps[0].length(); j++) {
                if (maps[i].charAt(j)!='X' && !visited[i][j]) {
                    int localCnt = maps[i].charAt(j) - '0';
                    Queue<Point> que = new LinkedList<>();
                    
                    que.add(new Point(i, j));
                    visited[i][j] = true;
                    
                    while (!que.isEmpty()) {
                        Point p = que.poll();
                        int x = p.x;
                        int y = p.y;
                        
                        for (int k=0; k<4; k++) {
                            int xx = x + dx[k];
                            int yy = y + dy[k];
                            if (xx>=0 && yy>=0 && xx<maps.length && yy<maps[0].length()) {
                                if (maps[xx].charAt(yy)!='X' && !visited[xx][yy]) {
                                    que.add(new Point(xx, yy));
                                    visited[xx][yy] = true;
                                    localCnt += maps[xx].charAt(yy) - '0';
                                }
                            }
                        }
                    }
                    answerList.add(localCnt);
                }
            }
        }
          
        if (answerList.isEmpty()) {
            answerList.add(-1);
        }
        
        Collections.sort(answerList);
        
        int answer[] = new int[answerList.size()];
        
        for (int i=0; i<answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}