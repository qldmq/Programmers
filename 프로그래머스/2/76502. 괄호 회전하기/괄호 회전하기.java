import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i=0; i<s.length(); i++) {
            Stack<Character> st = new Stack<>();
            String ss = s.substring(i) + s.substring(0, i);
            boolean b = true;
            
            for (int j=0; j<s.length(); j++) {
                char c = ss.charAt(j);
                if (c=='(' || c=='[' || c=='{') {
                    st.push(c);
                } else {
                    if (st.isEmpty()) {
                        b = false;
                        break;
                    }
                    
                    char p = st.pop();
                    
                    if (c==')' && p!='(') {
                        b = false;
                        break;
                    } else if (c==']' && p!='[') {
                        b = false;
                        break;
                    } else if (c=='}' && p!='{') {
                        b = false;
                        break;
                    }
                }
            }
            if (b && st.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
} 