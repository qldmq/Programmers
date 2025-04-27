class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int a = (int) Math.sqrt(sum);
        int cnt = 0;
        
        while (true) {
            int width = a + cnt;
            int height = sum / width;
            
            if (width*height == sum) {
                if ((width-2)*(height-2) == yellow) {
                    if (height >= width) {
                        answer[0] = height;
                        answer[1] = width;
                    } else {
                        answer[0] = width;
                        answer[1] = height;
                    }

                    return answer;
                }
            }
            cnt++;
        }
    }
}