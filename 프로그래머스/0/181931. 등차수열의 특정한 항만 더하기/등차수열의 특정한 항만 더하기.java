class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int sum = a;
        
        for (int i=0; i<included.length; i++) {
            if (included[i] == true) {
                answer += sum;
            }
            sum += d;
        }
        
        return answer;
    }
}