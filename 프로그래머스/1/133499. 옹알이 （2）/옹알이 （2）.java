class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pattern = {"aya", "ye", "woo", "ma"};
        for(String word : babbling){
            String replaceWord = word;
            for(int i = 0; i<4; i++){
                replaceWord = replaceWord.replaceAll(pattern[i], String.valueOf(i+1));
            }
            if(replaceWord.matches("[0-4]+") && !replaceWord.contains("11") && !replaceWord.contains("22") && !replaceWord.contains("33") && !replaceWord.contains("44")){
                answer++;
            }
        }
        
        
        return answer;
    }
}