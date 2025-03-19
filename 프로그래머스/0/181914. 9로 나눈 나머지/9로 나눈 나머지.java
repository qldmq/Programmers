class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for (int i=0; i<number.length(); i++) {
            answer += Integer.parseInt(String.valueOf(number.charAt(i)));
            // char는 원시 타입이기 때문에 .toString()을 사용할 수 없어서 String.valueOf()를 사용해야함
        }
        
        return answer%9;
    }
}