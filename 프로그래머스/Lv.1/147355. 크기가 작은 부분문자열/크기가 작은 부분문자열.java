class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i = 0; i < (t.length()-p.length()+1); i++){
            String t2 = t.substring(i, p.length()+i);
            long tV = Long.parseLong(t2);
            long pV = Long.parseLong(p);
            if(tV <= pV){
                answer++;
            }
        }
        return answer;
    }
}