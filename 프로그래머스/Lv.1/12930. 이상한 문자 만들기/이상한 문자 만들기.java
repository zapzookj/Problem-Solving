class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1);
        for(int i = 0; i < words.length; i++){
            char[] arr = words[i].toCharArray();
            if(!arr.equals(' ')){
                for(int j = 0; j < arr.length; j++){
                if(j % 2 == 0){
                    arr[j] = Character.toUpperCase(arr[j]);
                }else if(j % 2 == 1){
                    arr[j] = Character.toLowerCase(arr[j]);
                }
                }
                answer += new String(arr);
                if(i < words.length - 1){
                answer += ' ';
                }
            }else{
                answer += new String(arr);
            }
            // if(i < words.length - 1){
            //     answer += ' ';
            // }
        }
        return answer;
        // char[] arr = s.toCharArray();
        // HashMap<Integer, String> map = new HashMap<>();
        // int count = 0;
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] == ' '){
        //         map.put(count, answer);
        //         answer = "";
        //         count++;
        //     }else if(arr[i] != ' '){
        //         answer += arr[i];
        //     }
        // }
        // for(int i = 0; i <= count; i++){
        //     String ss = map.get(i);
        //     char[] arrChar = ss.toCharArray();
        //     for(int j = 0; j < arrChar.length; j++){
        //         if(j % 2 == 0){
        //             arrChar[j] = Character.toUpperCase(arrChar[j]);
        //         }
        //     }
        //     answer += String.valueOf(arrChar) + ' ';
        // }
        // return answer.trim();
    }
}