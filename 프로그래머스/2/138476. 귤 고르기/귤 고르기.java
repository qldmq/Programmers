import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int n : tangerine) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        
        int sum = 0;
        
        for (int i=0; i<list.size(); i++) {
            sum += list.get(i).getValue();
            answer++;
            if (sum >= k) {
                break;
            }
        }
        
        return answer;
    }
}