class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int dx[] = {1, -1, 0, 0};
        int dy[] = {0, 0, 1, -1};
        String color = board[h][w];

        int xx = 0;
        int yy = 0;
        
        for (int i=0; i<4; i++) {
            xx = h + dx[i];
            yy = w + dy[i];
            
            if (xx>=0 && yy>=0 && xx<board.length && yy<board[0].length) {
                if (color.equals(board[xx][yy])) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}