class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        if(s.length() ==4 || s.length() ==6){
            try{
                int number = Integer.parseInt(s);
                return true;
            }catch (NumberFormatException e){
                return false;
            }
        }
        return answer;
    }
}