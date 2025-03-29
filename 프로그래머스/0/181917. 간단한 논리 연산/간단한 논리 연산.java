class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x = false;
        boolean y = false;
        
        if (x1 || x2) {
            x = true;
        }
        if (x3 || x4) {
            y = true;
        }
        
        if (x && y) {
            answer = true;
        } else {
            answer = false;
        }
        
        return answer;
    }
}