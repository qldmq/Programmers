class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a == b && b == c) {
            answer = (int)((a+b+c) * (a*a+b*b+c*c) * (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3)));
        } else if (a==b || a==c || b==c) {
            answer = (a+b+c) * ((a*a)+(b*b)+(c*c));
        } else {
            answer = a+b+c;
        }
        
        return answer;
    }
}