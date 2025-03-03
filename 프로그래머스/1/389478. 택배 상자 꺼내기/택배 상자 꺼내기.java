class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int y = 0;
        int yy = -1;

        if (n%w != 0) {
            y = (n/w) + 1;
        } else {
            y = n/w;
        }

        int ary[][] = new int[y][w];

        int i = 0;
        int p = 1;

        while (true) {
            for (int j=0; j<w; j++) {
                if (yy == j) {
                    answer++;
                }

                ary[i][j] = p;
                if (p == num) {
                    yy = j;
                }
                if (p==n) {
                    return answer+1;
                }
                p++;
            }
            i++;
            for (int k=w-1; k>=0; k--) {
                if (yy == k) {
                    answer++;
                }
                
                ary[i][k] = p;
                if (p == num) {
                    yy = k;
                }
                if (p==n) {
                    return answer+1;
                }
                p++;
            }
            i++;
        }
        
        
    }
}