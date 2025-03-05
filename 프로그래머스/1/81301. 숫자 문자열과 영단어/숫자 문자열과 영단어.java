import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        char[] charArray = s.toCharArray();
        
        for(int i = 0; i < charArray.length; i++) {
            if (!Character.isDigit(charArray[i])) {
                sb.append(charArray[i]);
            } else {
                answer.append(charArray[i]);
            }
            
            if (map.containsKey(sb.toString())) {
                answer.append(map.get(sb.toString()));
                sb.setLength(0);
            }
        }
        
        return Integer.parseInt(answer.toString());
        
    }
}
// StringBuilder : 문자열을 StringBuilder로 선언하면 해당 메서드의 각종 기능들을 사용할 수 있다(append 등)
// Character.isDigit() : 괄호안의 문자가 정수인지 확인한다.(맞으면 true, 틀리면 false)
// 맵.containsKey() : 괄호안의 들어가는 값을 맵이 키로 가지고 있는지 확인한다.
// StringBuilder.setLength() : 스트링의 길이를 0으로 설정(클리어)
// StringBuilder에 들어있는 문자열은 .toString()으로 다시 변환해 주어야 한다.