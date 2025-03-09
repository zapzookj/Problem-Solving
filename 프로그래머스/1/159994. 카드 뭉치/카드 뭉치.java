class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards1[num1])) {
                if (num1<cards1.length-1) {num1++;} else {temp1++;}
            } else if (goal[i].equals(cards2[num2])) {
                if (num2<cards2.length-1) {num2++;} else {temp2++;}
            }
        }
        answer = (goal.length) == num1+num2+temp1+temp2 ? "Yes":"No";
        return answer;
    }
}