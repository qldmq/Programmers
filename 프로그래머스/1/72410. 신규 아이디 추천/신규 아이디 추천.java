import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        new_id = new_id.replaceAll("\\.+", ".");
        
        new_id = new_id.replaceAll("^\\.|\\.$", "");    // '|' 양옆에 띄어쓰기하면 공백을 추가로 넣음
        
        if (new_id.isEmpty()) {
            new_id = "a";
        }
        
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
            new_id = new_id.replaceAll("\\.$", "");
        }
        
        while(new_id.length() <= 2) {
            new_id += new_id.charAt(new_id.length()-1);
        }
        
        return answer = new_id;
    }
}