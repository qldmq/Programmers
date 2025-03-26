class Solution {
    public String solution(String my_string, int[][] queries) {
        char answer[] = my_string.toCharArray();
        // String은 불변이므로 .toCharArray로 변환해서 사용
        
        for (int query[] : queries) {
            int start = query[0];
            int end = query[1];
            
            while (start<end) {
                char temp = answer[start];
                answer[start] = answer[end];
                answer[end] = temp;
                
                start++;
                end--;
            }
        }
        
        return new String(answer);  // String으로 반환해주어야하기 때문에 변환
    }
}