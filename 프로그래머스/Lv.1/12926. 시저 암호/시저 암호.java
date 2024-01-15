class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                answer.append(ch);
                continue;
            }

            int base = Character.isUpperCase(ch) ? 'A' : 'a';
            int num = (ch - base + n) % 26;
            if (num < 0) {
                num += 26;
            }
            answer.append((char) (base + num));
        }
        return answer.toString();
        // String answer = "";
        // char[] arr = s.toCharArray();
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] != ' '){
        //         int num = (int) arr[i];
        //         num += n;
        //         if(num > 90 && num < 97){
        //             num -= 26;
        //         }else if(num > 122){
        //             num -= 26;
        //         }
        //         arr[i] = (char) num;
        //     }
        // }
        // answer = new String(arr);
        // return answer;
    }
}