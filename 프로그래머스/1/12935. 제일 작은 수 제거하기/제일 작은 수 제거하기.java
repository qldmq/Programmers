class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            int answer[] = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length - 1];
        int temp = 9999999;
        int cnt = 0;
        
        for (int ary : arr) {
            if (temp > ary) {
                temp = ary;
            }
        }
        
        for (int ary : arr) {
            if (temp != ary) {
                answer[cnt] = ary;
                cnt++;
            }
        }
        
        return answer;
    }
}