class Solution {
    public String solution(String s) {
        String answer = "";
        String ary[] = s.split(" ");
        int min = Integer.parseInt(ary[0]);
        int max = Integer.parseInt(ary[0]);
        
        for (int i=1; i<ary.length; i++) {
            int num = Integer.parseInt(ary[i]);
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}