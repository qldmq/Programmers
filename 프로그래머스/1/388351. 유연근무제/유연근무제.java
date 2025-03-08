class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i=0; i<schedules.length; i++) {
            int newStartday = startday;
            boolean check = false;
            int hour = schedules[i] / 100;
            int minute = (schedules[i] % 100) + 10;
            if (minute > 59) {
                hour += minute / 60;
                minute = minute % 60;
                if (hour > 24) {
                    hour = hour % 24;
                }
            }
            
            for (int j=0; j<timelogs[0].length; j++) {
                if (newStartday == 6) {
                    newStartday++;
                    continue;
                } else if (newStartday == 7) {
                    newStartday = 1;
                    continue;
                }
                
                int todayHour = timelogs[i][j] / 100;
                int todayMin = timelogs[i][j] % 100;

                newStartday++;
                
                if (hour < todayHour || (hour == todayHour && minute < todayMin)) {
                    check = true;
                    break;
                }
            }
            
            if (check) {
                continue;
            }
            answer++;
        }
        
        return answer;
    }
}