class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] number = phone_number.toCharArray();
        for(int i =0;i<number.length-4;i++){
            number[i] = '*';
        }
        return new String(number);
    }
}