class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        answer = new int[photo.length];
        
        for (int i=0; i<photo.length; i++) {
            int cnt = 0;
            for (int j=0; j<name.length; j++) {
                for (int k=0; k<photo[i].length; k++) {
                    if (name[j].equals(photo[i][k])) {
                        cnt += yearning[j];
                        break;
                    }
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}