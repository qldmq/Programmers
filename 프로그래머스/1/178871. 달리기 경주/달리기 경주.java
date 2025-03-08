import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            int num = map.get(calling);
            
            String temp = players[num-1];
            players[num-1] = players[num];
            players[num] = temp;
            
            map.put(players[num-1], num-1); 
            map.put(players[num], num);
        }
        
        answer = players;
        
        return answer;
    }
}