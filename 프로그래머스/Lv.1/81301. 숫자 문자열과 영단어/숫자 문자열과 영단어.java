import java.util.HashMap;

class Solution {
    public int solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        StringBuilder answer = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                answer.append(c);
            }else{
                currentWord.append(c);
                if(map.containsKey(currentWord.toString())){
                    answer.append(map.get(currentWord.toString()));
                    currentWord.setLength(0);
                }
            }
        }
        return Integer.parseInt(answer.toString());
    }
}