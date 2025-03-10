class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean visited_ary[] = new boolean[n];
        
        for (int i=0; i<n; i++) {
            if (!visited_ary[i]) {
                DFS(i, computers, visited_ary);
                answer++;
            }
        }
        
        return answer;
    }

    public static void DFS(int i, int computers[][], boolean visited[]) {
        visited[i] = true;
        
        for (int j=0; j<computers[0].length; j++) {
            if (computers[i][j]==1 && !visited[j]) {
                DFS(j, computers, visited);
            }
        }
    }
}