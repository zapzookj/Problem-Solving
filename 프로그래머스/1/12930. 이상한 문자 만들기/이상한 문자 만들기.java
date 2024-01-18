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
        }
        return answer;
    }
}